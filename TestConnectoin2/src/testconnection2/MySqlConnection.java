
package testconnection2;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;

public class MySqlConnection {
  public static void main(String []args){
      String url="jdbc:mysql://localhost:3306/db1";
    try{
        Class.forName("com.mysql.jdbc.Driver");
         System.out.println("Driver loaded");
         Connection con=DriverManager.getConnection(url,"root","");
          System.out.println("connection established");
          //write code
          try{
              con.close();
          }catch(SQLException e){
              System.out.println("Sql exectpion: "+e.getMessage());
          }
    }
    catch(ClassNotFoundException e){
        System.out.println("Driver not found: "+e.getMessage());
    }
    catch(SQLException e){
         System.out.println("connection not established: "+e.getMessage());
    }
  }  
}
