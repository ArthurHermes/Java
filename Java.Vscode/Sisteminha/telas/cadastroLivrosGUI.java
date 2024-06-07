package telas;

import conexao.ConexaoBancoDados;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cadastroLivrosGUI extends JFrame{
    
    public cadastroLivrosGUI(){
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

        /* Criando o painel principal */
        JPanel painelCadastroLivro = new JPanel(new GridLayout(3, 1, 10 ,10));
        painelCadastroLivro.setBackground(Color.GRAY);


        /* Criando painel para o nome do livro */
        JPanel nomeLivroPanel = new JPanel();
        nomeLivroPanel.setBackground(Color.GRAY);


        /* Criando painel para adicionar o valor do livro */
        JPanel valorLivroPanel = new JPanel();
        valorLivroPanel.setBackground(Color.GRAY);


        /* Criando painel para adicionar o numero de paginas do livro */
        JPanel qntdPaginaLivroPanel = new JPanel();
        qntdPaginaLivroPanel.setBackground(Color.GRAY);

        /* Criando painel para adicionar a categoria do livro */
        JPanel categoriaLivroPanel = new JPanel();
        categoriaLivroPanel.setBackground(Color.GRAY);

        /* Criando painel  para adicionar a classificação indicativa do livro*/
        JPanel classsificacaoIndicativaPanel = new JPanel();
        classsificacaoIndicativaPanel.setBackground(Color.GRAY);

        /* Criando painel para adicionar o idioma */
        JPanel idiomaPanel = new JPanel();
        idiomaPanel.setBackground(Color.GRAY);



        ///////////////////////////////////////////////////////////
        // Campo com o nome do livro
        
        JLabel nomeLivro = new JLabel("Nome do Livro");
        JTextField nomeLivroField = new JTextField();
        nomeLivro.setForeground(Color.WHITE);

        ///////////////////////////////////////////////////////////
        // Campo com o valor do livro

        JLabel valorLivro = new JLabel();
        JTextField valorLivroField = new JTextField();
        valorLivro.setForeground(Color.WHITE);

        ////////////////////////////////////////////////////////////
        // Campo com a quantidade de paginas do livro

        JLabel qntdPagina = new JLabel();
        JTextField qntdPaginaLivroField = new JTextField();
        qntdPagina.setForeground(Color.WHITE);

        ///////////////////////////////////////////////////////////
        // Campo com o idioma dos livros

        JLabel idioma = new JLabel();
        JTextField idiomaField = new JTextField();
        idioma.setForeground(Color.WHITE);

        //////////////////////////////////////////////////////////
        // Campo com a disponibilidade dos livros

        JLabel disponibilidade = new JLabel();
        JTextField disponibilidadeField = new JTextField();
        disponibilidade.setForeground(Color.WHITE);

        ///////////////////////////////////////////////////////////
        // Campo com as categorias de livro

        JLabel categoriaLivro = new JLabel();
        String[] generos = {"Romance", "Ficção Científica", "Fantasia", "Mistério", "Suspense", "Horror", "Biografia", "História", "Programação", "Gastronomia"};
        JComboBox<String> comboBoxgeneros = new JComboBox<>(generos);
        categoriaLivro.setForeground(Color.WHITE);


        //////////////////////////////////////////////////////////
        // Campo com as classificaçoes indicativas
        
        JLabel classificacaoIndicativa = new JLabel();
        String[] classificacoes = {"Infantil", "Livre"};
        JComboBox<String> comboBoxcassificacao = new JComboBox<>(classificacoes);
        classificacaoIndicativa.setForeground(Color.WHITE);




        
        setVisible(true);
    }


    public static void main(String args[]){
        new cadastroLivrosGUI();
    }
}
