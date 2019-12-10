package UsermanagmentLogin;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {
	Scanner s=new Scanner(System.in);
	//Connection con=new Connection();
	public void inser1tData()  throws ClassNotFoundException, SQLException {
			java.sql.Connection con=null;//Connection object
			//2)create a Connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentadmin","root","");
			System.out.println("Enter the user id");
			int userid=s.nextInt();
			System.out.println("Enter the user name");
			String username=s.next();
			System.out.println("Enter the password");
			String password=s.next();
			PreparedStatement ps=con.prepareStatement("insert into admin(Userid,Username,Password)values(?,?,?);");
			ps.setInt(1,userid);
			ps.setString(2,username);
			ps.setString(3,password);
		ps.executeUpdate();
		System.out.println("Successfull...!");
		}
	
			// TODO Auto-generated method stub
			
		}
		
	



