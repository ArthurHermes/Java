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
    
    private static String url = "jdbc:mysql://localhost:3306/biblioteca";
    private static String user = "root";
    private static String password = "";


    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }
}

