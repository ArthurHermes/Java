import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import CRUD.livro.visualizarLivro;

import java.awt.Color;
import java.util.List;

public class DeletLivrosGUI extends JFrame {

    public DeletLivrosGUI() {
        setTitle("Excluir livros");
        setSize(700, 500);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.GRAY);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel painel = new JPanel();
        painel.setBackground(Color.GRAY);

        JLabel livrosLabel = new JLabel("Livros Cadastrados: ");
        livrosLabel.setForeground(Color.WHITE);

        List<String> livros = visualizarLivro.visualizar();


        String[] livrosArray = new String[livros.size()];
        livros.toArray(livrosArray);

 
        JComboBox<String> comboBoxLivros = new JComboBox<>(livrosArray);

        painel.add(livrosLabel);
        painel.add(comboBoxLivros);

        add(painel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new DeletLivrosGUI();
    }
}
