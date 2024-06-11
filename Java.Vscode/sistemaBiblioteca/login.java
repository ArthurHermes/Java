import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import conexao.ConexaoBancoDados;

public class login{

    public void consultarUsuario(String usuario, String senha) {
        try {
            Connection connection = ConexaoBancoDados.getConnection();

            String sql = "SELECT * FROM usuario WHERE nome = ? AND senha = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, usuario);
            statement.setString(2, senha);

            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()){
                JOptionPane.showMessageDialog(null, "Bem Vindo! " + resultSet.getString("nome"));
                if ("gerente".equals(resultSet.getString("tpUsuario"))) {
                    
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
            }

            connection.close();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}
