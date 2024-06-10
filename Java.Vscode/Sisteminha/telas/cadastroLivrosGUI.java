package telas;

import conexao.*;
import javax.swing.*;

import CRUDE.livro.cadastroLivro;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cadastroLivrosGUI extends JFrame {
    ConexaoBancoDados conexao = new ConexaoBancoDados();

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

        cadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = nomeLivroField.getText();
                float valor = Float.parseFloat(valorLivroField.getText());
                int numPag = Integer.parseInt(numPaginaLivroField.getText());
                String idioma = idiomaField.getText();
                String disponibilidade = (String) comboBoxDisponibilidade.getSelectedItem();
                String categoria = (String) comboBoxgeneros.getSelectedItem();
                String classificacao = (String) comboBoxclassificacao.getSelectedItem();

                cadastroLivro cadastro = new cadastroLivro();
                if (cadastro.cadastrarLivro(nome, valor, numPag, idioma, disponibilidade, categoria, classificacao)) {
                    limparCampo(nomeLivroField, valorLivroField, numPaginaLivroField, idiomaField, comboBoxDisponibilidade, comboBoxclassificacao, comboBoxgeneros);
                } else {
                    limparCampo(nomeLivroField, valorLivroField, numPaginaLivroField, idiomaField, comboBoxDisponibilidade, comboBoxclassificacao, comboBoxgeneros);
                }
            }
        });


        voltarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new telaInicial();
            }
        });
    }
    

    public void limparCampo(JTextField nomeLivroField, JTextField valorLivroField, JTextField numPaginaLivroField, JTextField idiomaField, JComboBox<String> comboBoxDisponibilidade, JComboBox<String> comboBoxclassificacao, JComboBox<String> comboBoxgeneros){
        JOptionPane.showMessageDialog(null, "Erro ao cadastrar o livro");
        nomeLivroField.setText("");
        valorLivroField.setText("");
        numPaginaLivroField.setText("");
        idiomaField.setText("");
        comboBoxDisponibilidade.setSelectedIndex(0);
        comboBoxgeneros.setSelectedIndex(0);
        comboBoxclassificacao.setSelectedIndex(0);
    }


    public static void main(String args[]) {
        new cadastroLivrosGUI();
    }
}
