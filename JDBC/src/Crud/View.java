package Crud;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class View {
connection con=new connection();
	
	public void view()throws ClassNotFoundException,SQLException 
	{
		// TODO Auto-generated method stub
		Statement smt=(Statement) con.getConnection().createStatement();
		ResultSet rs=smt.executeQuery("Select * from student");
		System.out.println("Name"+"\t"+"RollNo"+"\t"+"Year"+"\t"+"Department"+"\t"+"Address");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));
		}
	}


}
