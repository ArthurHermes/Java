package CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import conexao.ConexaoBancoDados;

public class cadastroLivro{

    public void cadastrarLivro(String nome, float valor, int numPag, String idioma, String disponibilidade, String categoria, String classificacao){
        try{

            Connection connection = ConexaoBancoDados.getConnection();

            String sql = "INSERT INTO livro(nome, valor, numPag, categoria, classificacao, idioma, disponibilidade) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, nome);
            statement.setFloat(2, valor);
            statement.setInt(3, numPag);
            statement.setString(4, categoria);
            statement.setString(5, classificacao);
            statement.setString(6, idioma);
            statement.setString(7, disponibilidade);

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0){
                JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso");
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar novo livro!");
            }


        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());

        }
    }

}
