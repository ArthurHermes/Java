import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Screen extends JFrame{

    public Screen() {

        // Dando um titulo para a janela
        setTitle("Teste");
        // Deixando ela visivel
        setVisible(true);
        // Definindo um tmanho
        setSize(800, 500);
        //Encerrando o programa ao clicar no X
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Bloquear a opção de redimensionar a janela
        setResizable(false);
        // Fazer com que a tela abra centralizada e não encostada no canto
        setLocationRelativeTo(null);

        // Setando o Layout para nulo
        setLayout(null);
        //Criando o botao
        JButton jButton = new JButton();
        //Definindo o texto do botão
        jButton.setText("Clique aqui");
        //Setando posição em x e  y, largura e altura (respectivamente)
        jButton.setBounds(100, 200, 250, 70);
        //Setando uma fonte para o text, usando o nome da fonte, a estilização e o tamanho (respectivamente)
        jButton.setFont(new Font("Arial", Font.BOLD, 40));

        //Setando a cor da escrita do botão
        jButton.setForeground(new Color(237, 241, 238));
        //Setando a cor do fundo do botão
        jButton.setBackground(new Color(10, 10, 10));


        //Adicioando o botão na tela
        add(jButton);



    }
}
