import java.io.*;
import java.sql.*;

public class eg
{
public static void main(String args[]) 
{
try
{
Class.forName("com.mysql.jdbc.Driver");
System.out.println("loading driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");
System.out.println("CONNECTED");
}catch(Exception e)
{
	System.out.println(e);
}
}


}
