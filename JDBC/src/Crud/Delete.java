package Crud;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
	connection con=new connection();
	public void deletedata() throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Rollno:");
		int rollno=s.nextInt();
		PreparedStatement ps=con.getConnection().prepareStatement("delete from student where RollNo=?");
		ps.setInt(1,rollno);
		ps.executeUpdate();
		System.out.println("Successfully Deleted...");
		
	}

}
