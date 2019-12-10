package Crud;

import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.PreparedStatement;

public class Insert {
	connection con=new connection();
	public void insertData()throws ClassNotFoundException,SQLException
 {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name:");
		String name=s.next();//read name
		System.out.println("Enter Rollno:");
		int rollno=s.nextInt();//read rollno
		System.out.println("Enter Year:");
		int year=s.nextInt();//read year
		System.out.println("Enter Department:");
		String dep=s.next();//read department
		System.out.println("Enter Address:");
		String address=s.next();//read address
		PreparedStatement ps=(PreparedStatement) con.getConnection().prepareStatement("insert into student(Name,RollNo,Year,Department,Address)values(?,?,?,?,?);");
		ps.setString(1,name);//
		ps.setInt(2,rollno);
		ps.setInt(3,year);
		ps.setString(4,dep);
		ps.setString(5,address);
		ps.executeUpdate();
		System.out.println("Successfully inserted...");
	}
	
		
	
	
}
