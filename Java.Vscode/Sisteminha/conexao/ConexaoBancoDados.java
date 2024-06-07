package conexao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoBancoDados {
    
    String url = "jdbc:mysql://localhost:3306/biblioteca";
    String user = "root";
    String password = "";


    public void consultarLivros() {
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão bem-sucedida!");

            String sql = "SELECT * FROM usuario";
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int idUsuario = resultSet.getInt("idUsuario");
                String nome = resultSet.getString("nome");
                String senha = resultSet.getString("senha");
                String endereco = resultSet.getString("endereco");
                String tipoUsuario = resultSet.getString("tpUsuario");

                System.out.println(
                        "----------------------\n" +
                        "id: " + idUsuario + 
                        "\nNome: " + nome +
                        "\nSenha: " + senha + 
                        "\nendereco" + endereco +
                        "\nTipo Usuario: " + tipoUsuario +
                        "\n" +
                        "----------------------");
            }

            connection.close();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ConexaoBancoDados conexao = new ConexaoBancoDados();
        conexao.consultarLivros();
    }
}
