package telas;


import conexao.ConexaoBancoDados;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.sql.Connection;

public class telaInicial extends JFrame {
    
    Connection conexao = ConexaoBancoDados.getConnection();


    public telaInicial() {
        setTitle("Biblioteca");
        setSize(700, 500);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.GRAY);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        /* Setando o GridBagLayout para centralizar verticalmente e horizontalmente */
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.anchor = GridBagConstraints.CENTER;

        /* Criando painel de login e setando a cor de fundo para cinza */
        JPanel painelLogin = new JPanel(new GridLayout(3, 1, 10, 10));
        painelLogin.setBackground(Color.GRAY);

        /* Criando painel de Usuario e setando a cor de fundo para cinza */
        JPanel painelUsuario = new JPanel(new FlowLayout(FlowLayout.CENTER));
        painelUsuario.setBackground(Color.GRAY);


        /* Criando painel de Senha e setando a cor de fundo para cinza */
        JPanel painelSenha = new JPanel(new FlowLayout(FlowLayout.CENTER));
        painelSenha.setBackground(Color.GRAY);


        /* Criando painel de Logar e setando a cor de fundo para cinza */
        JPanel painelLogar = new JPanel(new FlowLayout(FlowLayout.CENTER));
        painelLogar.setBackground(Color.GRAY);


        /////////////////////////////////////////////////////////////////////////
        // Campo de usuario

        /* Criando o JLabel de usuario */
        JLabel user = new JLabel("Usuario: ");

        /* Setando a cor do texto para branco */
        user.setForeground(Color.WHITE); 

        /* Criando o campo de usuario */
        JTextField userField = new JTextField();
        
        /* Setando o tamanho de preferencia do campo de usuario */
        userField.setPreferredSize(new Dimension(200, 30));

        /* Adicionando os campos de usuario no JPanel de usuario */
        painelUsuario.add(user);
        painelUsuario.add(userField);

        /////////////////////////////////////////////////////////////////////////
        // Campo senha

        /* Criando o JLabel de senha */
        JLabel psswd = new JLabel("Senha: ");

        /* Setando a cor da letra para branco */
        psswd.setForeground(Color.WHITE);

        /* Criando o campo de senha */
        JPasswordField psswdField = new JPasswordField();

        /* Setando o tamanho de preferencia para o campo de senha */
        psswdField.setPreferredSize(new Dimension(200, 30));
        
        /* Adicionando os campos de senha no Jpanel de senha */
        painelSenha.add(psswd);
        painelSenha.add(psswdField);

        //////////////////////////////////////////////////////////////////////////

        // Botao de logar

        /* Criando o botão para logar */
        JButton logar = new JButton("Logar");

        /* Adicionando o botao ao JLabel de logar */
        painelLogar.add(logar);

        //////////////////////////////////////////////////////////////////////////


        /* Adicionando os paineis de usuario, senha e o botao de logar no painel de login */
        painelLogin.add(painelUsuario);
        painelLogin.add(painelSenha);
        painelLogin.add(painelLogar);

        /* Adicionando o painel na tela principal */
        add(painelLogin, gbc);
        setVisible(true);




        //////////////////////////////////////////////////////////////////////////
        // Adicionando ação aos botões


        logar.addActionListener((ActionEvent e) -> {
            String usuario = userField.getText();
            String senha = new String(psswdField.getPassword());

            login loginInstance = new login();
            // Chamar o método consultarUsuario da instância criada
            loginInstance.consultarUsuario(usuario, senha, this);
        });







    }

    public static void main(String[] args) {
        new telaInicial();
    }
}
