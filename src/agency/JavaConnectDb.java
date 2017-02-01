package agency;
import java.sql.*;
import java.sql.DriverManager;

import java.sql.SQLException;

import javax.swing.JOptionPane;


public class JavaConnectDb {
   
    /**
     *
     * @return
     */
    public static Connection ConnectrDb() {
          Connection con;
     try{
         Class.forName("oracle.jdbc.driver.OracleDriver");  
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","swapnil");  
  return con;
     }
    catch (ClassNotFoundException | SQLException e) {
       JOptionPane.showMessageDialog(null, e); 
    }
         return null;

    }

 
}
