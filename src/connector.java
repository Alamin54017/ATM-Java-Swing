




import java.sql.*;
import javax.swing.JOptionPane;
public class connector {
    public static Connection connectDB() 
{
Connection conn=null;
try
{
Class.forName("com.mysql.jdbc.Driver");  //Driver Registration

conn = DriverManager.getConnection("jdbc:mysql://localhost/atm","root", "");
//Statement stt = conn.createStatement();
return conn;
}
catch(Exception e)
{
System.out.print("Do not connect to DB - Error:"+e);
return null;
} 
}
}
