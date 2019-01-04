
package login.criedentials;
import java.sql.*;    //jdbc API
import javax.swing.JOptionPane;

public class connectionoracle {
    Connection con;
    public static Connection connectoracle(){
    String url="jdbc:oracle:thin:@localhost:1521:XE";
    try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
      //   System.out.println("Driver loaded");
         Connection con=DriverManager.getConnection(url, "ashish", "ashish");
        return con;
    }
    catch(ClassNotFoundException e){
        //System.out.println("Driver not found");
        JOptionPane.showMessageDialog(null, e);
          return null;
    }
    catch(SQLException e){
        // System.out.println("connection not established :"+e.getMessage());
        JOptionPane.showMessageDialog(null, e);
          return null;
    }
    
}    
}