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

public class ConexaoBancoDados {
    
    String url = "jdbc:mysql://localhost:3306/biblioteca";
    String user = "root";
    String password = "";


    public void consultarUsuario(String usuario, String senha, JTextField userField, JPasswordField psswdField, JFrame telaInicial) {
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
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
                userField.setText("");
                psswdField.setText("");
            }


            connection.close();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }
}
