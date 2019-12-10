package Crud;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Update {
	connection con=new connection();
	public void updatedata()throws ClassNotFoundException,SQLException {
		
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Statement smt=(Statement) con.getConnection().createStatement();
		System.out.println("Enter Id:");
		int rollno=s.nextInt();
		System.out.println("Enter new name:");
		String name=s.next();
		//System.out.println("Enter new year:");
		//String year=s.next();
		//System.out.println("Enter new Department:");
		//String dep=s.next();
		PreparedStatement ps=con.getConnection().prepareStatement("update student set Name=? where RollNo=?");
		ps.setString(1, name);
		ps.setInt(2, rollno);
		ps.executeUpdate();
		System.out.println("Successfully Updated...");
	}

}
