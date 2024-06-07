package telas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaInicial extends JFrame {
    public telaInicial() {
        setTitle("Biblioteca");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel login = new JPanel(new GridLayout(3, 1, 1, 1)); // GridLayout com 3 linhas e 1 coluna, espaçamento vertical de 5 pixels

        JPanel panelUsuario = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 5)); // Painel para centralizar o campo de usuário com espaçamento de 5 pixels
        JLabel usuario = new JLabel("Usuário:");
        JTextField campoUsuario = new JTextField(15);
        panelUsuario.add(usuario);
        panelUsuario.add(campoUsuario);

        JPanel panelSenha = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0)); // Painel para centralizar o campo de senha com espaçamento de 5 pixels
        JLabel senha = new JLabel("Senha:");
        JPasswordField campoSenha = new JPasswordField(15);
        panelSenha.add(senha);
        panelSenha.add(campoSenha);

        JPanel panelBotao = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0)); // Painel para centralizar o botão de login com espaçamento de 5 pixels
        JButton botaoLogin = new JButton("Login");
        panelBotao.add(botaoLogin);

        login.add(panelUsuario);
        login.add(panelSenha);
        login.add(panelBotao);

        add(login);
        setVisible(true);
    }

    public static void main(String[] args) {
        new telaInicial();
    }
}
