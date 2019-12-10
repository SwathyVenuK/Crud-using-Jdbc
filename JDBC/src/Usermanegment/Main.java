package Usermanegment;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your choice:1.Admin 2.Student");
	int n=s.nextInt();
	if(n==1)
	{
		InsertAdmin obj=new InsertAdmin();
		obj.Admin();
	}
	else if(n==2)
	{
		InsertStd  obj1=new InsertStd();
		obj1.Student();
	}
	
	else
	{
		System.out.println("Invalid");
		
	}
	

	}

}
