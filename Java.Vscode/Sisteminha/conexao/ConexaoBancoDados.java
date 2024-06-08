package conexao;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import telas.cadastroLivrosGUI;

public class ConexaoBancoDados {
    
    String url = "jdbc:mysql://localhost:3306/biblioteca";
    String user = "root";
    String password = "";


    public void consultarUsuario(String usuario, String senha, JFrame telaInicial) {


        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            String sql = "SELECT * FROM usuario WHERE nome = ? AND senha = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, usuario);
            statement.setString(2, senha);

            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()){
                JOptionPane.showMessageDialog(null, "Bem Vindo! " + resultSet.getString("nome"));
                if (resultSet.getString("tpUsuario").equals("gerente")) {
                    telaInicial.dispose();
                    new cadastroLivrosGUI();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
            }


            connection.close();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }


    }


    // Criando a função para adicionar livros no banco de dados

    public void criarLivro(String nome, float valor, int numPag, String idioma, String disponibilidade, String categoria, String classificacao, JFrame telaInicial){
        try{
            Connection connection = DriverManager.getConnection(url, user, password);
            String sql = "INSERT INTO livro(nome, valor, numPag, categoria, classificacao, idioma, disponibilidade) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, nome);
            statement.setFloat(2, valor);
            statement.setInt(3, numPag);
            statement.setString(4, idioma);
            statement.setString(5, idioma);
            statement.setString(6, disponibilidade);
            statement.setString(7, categoria);
            statement.setString(8, classificacao);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()){
                JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso");

            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar novo livro!");
            }


        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }        
}

