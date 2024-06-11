

import java.awt.Color;

import javax.swing.JFrame;

public class exibirLivrosGUI extends JFrame{

    public exibirLivrosGUI(){
        setTitle("Livros Cadastrados");
        setSize(700, 500);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.GRAY);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        

        setVisible(true);
    }


}
