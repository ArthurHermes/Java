package CRUDE.livro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import conexao.ConexaoBancoDados;

public class cadastroLivro {

    public boolean cadastrarLivro(String nome, float valor, int numPag, String idioma, String disponibilidade, String categoria, String classificacao){
        try{

            boolean isRegistered = false;
            Connection connection = ConexaoBancoDados.getConnection();

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

            int rowsInserted = statement.executeUpdate();

            if (rowsInserted > 0){
                JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso");
                        return isRegistered = true;
            } else {
                JOptionPane.showMessageDialog(null, "Erro ao cadastrar novo livro!")
                return isRegistered;
            }


        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}
