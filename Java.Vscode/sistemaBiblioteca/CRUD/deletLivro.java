import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class deletLivro{
    public boolean deletarLivro(int id){
        try{
            boolean isdeleted = false;
            Connection connection = Connection.getConnection();

            String sqlSelect = "Select * from livro";
            PreparedStatement selecStatement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sqlSelect);

            while (resultSet.next()) {
                String item = resultSet.getString("nome");
                comboBox.addItem(item);
            }

            
            String sql = "Delete from livro where idlivro = ?";
            PreparedStatement statement = connection.prepareStatement(sql);

            


        }
    }
}