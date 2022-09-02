package db;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EclToSql {
public static void main(String[] args) {
try {
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "root");
System.out.println("connection is established");

PreparedStatement ps=con.prepareStatement("insert into demotab values(?,?)");

ps.setString(1,"2");
ps.setString(2,"priya");
//ps.setString(3,"anu");

ps.executeUpdate();
System.out.println("data inserted successfully");


}
catch(SQLException e) {
e.printStackTrace();
 }
}
}

