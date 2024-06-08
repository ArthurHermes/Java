package telas;

import conexao.*;
import javax.swing.*;
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
        gbc.fill = GridBagConstraints.BOTH;

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

        // Criando painel para o nome do livro
        JPanel nomeLivroPanel = new JPanel();
        nomeLivroPanel.setBackground(Color.GRAY);

        // Criando painel para adicionar o valor do livro
        JPanel valorLivroPanel = new JPanel();
        valorLivroPanel.setBackground(Color.GRAY);

        // Criando painel para adicionar o número de páginas do livro
        JPanel numPaginaLivroPanel = new JPanel();
        numPaginaLivroPanel.setBackground(Color.GRAY);

        // Criando painel para adicionar a categoria do livro
        JPanel categoriaLivroPanel = new JPanel();
        categoriaLivroPanel.setBackground(Color.GRAY);

        // Criando painel para adicionar a classificação indicativa do livro
        JPanel classsificacaoIndicativaPanel = new JPanel();
        classsificacaoIndicativaPanel.setBackground(Color.GRAY);

        // Criando painel para adicionar o idioma
        JPanel idiomaPanel = new JPanel();
        idiomaPanel.setBackground(Color.GRAY);

        // Criando o painel de disponibilidade
        JPanel disponibilidadePanel = new JPanel();
        disponibilidadePanel.setBackground(Color.GRAY);

        // Criando painel do botão
        JPanel cadButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        cadButtonPanel.setBackground(Color.GRAY);

        // Campo com o nome do livro
        JLabel nomeLivro = new JLabel("Nome do Livro: ");
        JTextField nomeLivroField = new JTextField();
        nomeLivroField.setPreferredSize(new Dimension(200, 30));
        nomeLivro.setForeground(Color.WHITE);

        // Campo com o valor do livro
        JLabel valorLivro = new JLabel("Valor do Livro: ");
        JTextField valorLivroField = new JTextField();
        valorLivroField.setPreferredSize(new Dimension(200, 30));
        valorLivro.setForeground(Color.WHITE);

        // Campo com a quantidade de páginas do livro
        JLabel numPagina = new JLabel("Núm. de páginas: ");
        JTextField numPaginaLivroField = new JTextField();
        numPaginaLivroField.setPreferredSize(new Dimension(200, 30));
        numPagina.setForeground(Color.WHITE);

        // Campo com o idioma dos livros
        JLabel idioma = new JLabel("Idioma: ");
        JTextField idiomaField = new JTextField();
        idiomaField.setPreferredSize(new Dimension(200, 30));
        idioma.setForeground(Color.WHITE);

        // Campo com a disponibilidade dos livros
        JLabel disponibilidade = new JLabel("Disponibilidade");
        String[] disponibilidadefield = {"Disponível", "Alugado"};
        JComboBox<String> comboBoxDisponibilidade = new JComboBox<>(disponibilidadefield);
        disponibilidade.setForeground(Color.WHITE);

        // Campo com as categorias de livro
        JLabel categoriaLivro = new JLabel("Categoria");
        String[] generos = {"Romance", "Ficção Científica", "Fantasia", "Mistério", "Suspense", "Horror", "Biografia", "História", "Programação", "Gastronomia"};
        JComboBox<String> comboBoxgeneros = new JComboBox<>(generos);
        categoriaLivro.setForeground(Color.WHITE);

        // Campo com as classificações indicativas
        JLabel classificacaoIndicativa = new JLabel("Classificação Indicativa");
        String[] classificacoes = {"Infantil", "Livre"};
        JComboBox<String> comboBoxclassificacao = new JComboBox<>(classificacoes);
        classificacaoIndicativa.setForeground(Color.WHITE);

        // Criando Botão
        JButton cadButton = new JButton("Cadastrar");

        // Adicionando os Labels em seus determinados paineis
        nomeLivroPanel.add(nomeLivro);
        nomeLivroPanel.add(nomeLivroField);

        valorLivroPanel.add(valorLivro);
        valorLivroPanel.add(valorLivroField);

        numPaginaLivroPanel.add(numPagina);
        numPaginaLivroPanel.add(numPaginaLivroField);

        idiomaPanel.add(idioma);
        idiomaPanel.add(idiomaField);

        disponibilidadePanel.add(disponibilidade);
        disponibilidadePanel.add(comboBoxDisponibilidade);

        categoriaLivroPanel.add(categoriaLivro);
        categoriaLivroPanel.add(comboBoxgeneros);

        classsificacaoIndicativaPanel.add(classificacaoIndicativa);
        classsificacaoIndicativaPanel.add(comboBoxclassificacao);

        cadButtonPanel.add(cadButton);

        // Adicionando tudo no painel principal
        gbc.gridx = 0;
        gbc.gridy = 1;
        painelCadastro.add(nomeLivroPanel, gbc);
        gbc.gridy++;
        painelCadastro.add(valorLivroPanel, gbc);
        gbc.gridy++;
        painelCadastro.add(numPaginaLivroPanel, gbc);
        gbc.gridy++;
        painelCadastro.add(idiomaPanel, gbc);

        gbc.gridy = 1;
        gbc.gridx = 1;
        painelCadastro.add(disponibilidadePanel, gbc);
        gbc.gridy++;
        painelCadastro.add(categoriaLivroPanel, gbc);
        gbc.gridy++;
        painelCadastro.add(classsificacaoIndicativaPanel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        painelCadastrar.add(cadButtonPanel);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        add(painelCadastro, gbc);

        gbc.gridy++;
        gbc.gridwidth = 2;
        add(painelCadastrar, gbc);

        setVisible(true);


        cadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String nome = nomeLivroField.getText();
                float valor = Float.parseFloat(valorLivroField.getText());
                int numPag = Integer.parseInt(numPaginaLivroField.getText());
                String idioma = idiomaField.getText();
                String disponibilidade = (String)comboBoxDisponibilidade.getSelectedItem();
                String categoria = (String)comboBoxgeneros.getSelectedItem();
                String classificacao = (String)comboBoxclassificacao.getSelectedItem();

                if(conexao.criarLivro(nome, valor, numPag, idioma, disponibilidade, categoria, classificacao, cadastroLivrosGUI.this)){
                    JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso");
                    nomeLivroField.setText("");
                    valorLivroField.setText("");
                    numPaginaLivroField.setText("");
                    idiomaField.setText("");
                    comboBoxDisponibilidade.setSelectedIndex(0);
                    comboBoxgeneros.setSelectedIndex(0);
                    comboBoxclassificacao.setSelectedIndex(0);
                }else{
                    JOptionPane.showMessageDialog(null, "Erro ao cadastrar o livro");
                    nomeLivroField.setText("");
                    valorLivroField.setText("");
                    numPaginaLivroField.setText("");
                    idiomaField.setText("");
                    comboBoxDisponibilidade.setSelectedIndex(0);
                    comboBoxgeneros.setSelectedIndex(0);
                    comboBoxclassificacao.setSelectedIndex(0);
                };
                
            }
        });
    }

    public static void main(String args[]) {
        new cadastroLivrosGUI();
    }
}