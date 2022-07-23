import java.sql.*;

public class Test1 {

	public static void main(String[] args) {
		try {
		//	Class.forName("com.mysql.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quickproperty", "root", "root");
			Statement st = con.createStatement();
String s1="user1@gmail.com";
String s2="user1@";
 
 st.executeUpdate("INSERT INTO registration (email,password)VALUES('" + s1 + "','" + s2 + "')");
System.out.println("DOne");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
