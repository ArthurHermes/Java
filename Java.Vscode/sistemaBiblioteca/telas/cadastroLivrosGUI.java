package telas;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import CRUD.cadastroLivro;

public class cadastroLivrosGUI extends JFrame {


    public cadastroLivrosGUI() {
        setTitle("Cadastro de Livros");
        setSize(700, 500);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.GRAY);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Setando o GridBagLayout para centralizar verticalmente e horizontalmente
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Criando o título e centralizando-o
        JLabel txt = new JLabel("Cadastro de Livros");
        txt.setForeground(Color.WHITE);
        txt.setHorizontalAlignment(SwingConstants.CENTER);
        txt.setFont(new Font("Arial", Font.BOLD, 24)); // Alterando o tamanho da fonte
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        add(txt, gbc);

        gbc.gridwidth = 1; // Resetando gridwidth para 1

        // Criando o painel principal que conterá os painéis de cadastro
        JPanel painelCadastro = new JPanel(new GridBagLayout());
        painelCadastro.setBackground(Color.GRAY);

        // Criando o painel do botão para deixar o botão centralizado na parte inferior
        JPanel painelCadastrar = new JPanel(new FlowLayout(FlowLayout.CENTER));
        painelCadastrar.setBackground(Color.GRAY);

        // Campo com o nome do livro
        JLabel nomeLivro = new JLabel("Nome do Livro: ");
        JTextField nomeLivroField = new JTextField(20);
        nomeLivro.setForeground(Color.WHITE);

        // Campo com o valor do livro
        JLabel valorLivro = new JLabel("Valor do Livro: ");
        JTextField valorLivroField = new JTextField(20);
        valorLivro.setForeground(Color.WHITE);

        // Campo com a quantidade de páginas do livro
        JLabel numPagina = new JLabel("Núm. de páginas: ");
        JTextField numPaginaLivroField = new JTextField(20);
        numPagina.setForeground(Color.WHITE);

        // Campo com o idioma dos livros
        JLabel idioma = new JLabel("Idioma: ");
        JTextField idiomaField = new JTextField(20);
        idioma.setForeground(Color.WHITE);

        // Campo com a disponibilidade dos livros
        JLabel disponibilidade = new JLabel("Disponibilidade: ");
        String[] disponibilidadefield = {"Disponível", "Alugado"};
        JComboBox<String> comboBoxDisponibilidade = new JComboBox<>(disponibilidadefield);
        disponibilidade.setForeground(Color.WHITE);

        // Campo com as categorias de livro
        JLabel categoriaLivro = new JLabel("Categoria: ");
        String[] generos = {"Romance", "Ficção Científica", "Fantasia", "Mistério", "Suspense", "Horror", "Biografia", "História", "Programação", "Gastronomia"};
        JComboBox<String> comboBoxgeneros = new JComboBox<>(generos);
        categoriaLivro.setForeground(Color.WHITE);

        // Campo com as classificações indicativas
        JLabel classificacaoIndicativa = new JLabel("Classificação Indicativa: ");
        String[] classificacoes = {"Infantil", "Livre"};
        JComboBox<String> comboBoxclassificacao = new JComboBox<>(classificacoes);
        classificacaoIndicativa.setForeground(Color.WHITE);

        // Criando Botão
        JButton cadButton = new JButton("Cadastrar");
        JButton voltarButton = new JButton("Voltar");

        // Adicionando os Labels e Fields no painelCadastro
        gbc.gridx = 0;
        gbc.gridy = 1;
        painelCadastro.add(nomeLivro, gbc);
        gbc.gridx = 1;
        painelCadastro.add(nomeLivroField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        painelCadastro.add(valorLivro, gbc);
        gbc.gridx = 1;
        painelCadastro.add(valorLivroField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        painelCadastro.add(numPagina, gbc);
        gbc.gridx = 1;
        painelCadastro.add(numPaginaLivroField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        painelCadastro.add(idioma, gbc);
        gbc.gridx = 1;
        painelCadastro.add(idiomaField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        painelCadastro.add(disponibilidade, gbc);
        gbc.gridx = 1;
        painelCadastro.add(comboBoxDisponibilidade, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        painelCadastro.add(categoriaLivro, gbc);
        gbc.gridx = 1;
        painelCadastro.add(comboBoxgeneros, gbc);

        gbc.gridx = 0;
        gbc.gridy = 7;
        painelCadastro.add(classificacaoIndicativa, gbc);
        gbc.gridx = 1;
        painelCadastro.add(comboBoxclassificacao, gbc);

        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        painelCadastrar.add(voltarButton);
        painelCadastrar.add(cadButton);

        add(painelCadastro, gbc);

        gbc.gridy++;
        add(painelCadastrar, gbc);

        setVisible(true);

        cadButton.addActionListener((ActionEvent e) -> {
            String nome = nomeLivroField.getText();
            float valor = Float.parseFloat(valorLivroField.getText());
            int numPag = Integer.parseInt(numPaginaLivroField.getText());
            String idioma1 = idiomaField.getText();
            String disponibilidade1 = (String) comboBoxDisponibilidade.getSelectedItem();
            String categoria = (String) comboBoxgeneros.getSelectedItem();
            String classificacao = (String) comboBoxclassificacao.getSelectedItem();
            new cadastroLivro().cadastrarLivro(nome, valor, numPag, categoria, classificacao, idioma1, disponibilidade1);
        });


        voltarButton.addActionListener((ActionEvent e) -> {
            dispose();
            new telaInicial();
        });
    }
    


    public static void main(String args[]) {
        new cadastroLivrosGUI();
    }
}
