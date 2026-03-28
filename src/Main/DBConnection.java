package library;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

public static Connection getConnection() {

try {

Class.forName("com.mysql.cj.jdbc.Driver");

Connection con = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/library_db",
"root",
"password"
);

System.out.println("Database connected");

return con;

}

catch(Exception e) {

System.out.println(e);

return null;

}

}

}