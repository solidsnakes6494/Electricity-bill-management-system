import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    public Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "root", "zeldar_sql"); 
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}