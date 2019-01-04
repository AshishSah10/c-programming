
package testconnection2;

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;

public class testconnectionserver {
  public static void main(String []args){
      String url="jdbc:mysql://ashish1234.5gbfree.com:2083/ashish1234_db1";
    try{
        Class.forName("com.mysql.jdbc.Driver");
         System.out.println("Driver loaded");
         Connection con=DriverManager.getConnection(url,"ashish1234_ashish","ashish");
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
