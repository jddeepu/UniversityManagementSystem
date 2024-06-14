package university.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;

    Conn () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem", "root", "deepu@123");
            s = c.createStatement();  
            System.out.println("succseefull");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   	}
    

