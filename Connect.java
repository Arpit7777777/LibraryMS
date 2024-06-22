
package librarymanagementsystem;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect{
    public static Connection Connection(){
        Connection con=null;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "mysql");
        } catch (SQLException ex) {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}