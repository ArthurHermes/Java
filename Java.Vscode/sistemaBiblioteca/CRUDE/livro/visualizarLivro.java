package CRUDE.livro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class visualizarLivro {
    public static List<String> visualizar() {
        List<String> livros = new ArrayList<>();

        try {
            // Ajuste a URL do JDBC, usuário e senha conforme seu banco de dados
            String jdbcURL = "jdbc:mysql://localhost:3306/biblioteca";
            String username = "root";
            String password = "";
            
            Connection connection = DriverManager.getConnection(jdbcURL, username, password);
            
            String sql = "SELECT nome FROM livro";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                String nome = resultSet.getString("nome");
                livros.add(nome);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return livros;
    }
}
