package Crud;

//import java.sql.SQLException;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Main {

	
		public static void main(String[] args)throws ClassNotFoundException,SQLException {
			// TODO Auto-generated method stub
			int n;
			Scanner s=new Scanner(System.in);
			do{
			System.out.println("1.insert\n2.View\n3.Update\n4.Delete\n5.Exit");
			n=s.nextInt();
			//Insert obj1=new Insert();
			switch(n)
			{
			case 1:
		Insert obj1=new Insert();
				
			obj1.insertData();
				break;
			case 2:
			View obj2=new View();
			obj2.view();
				
				break;
			case 3:
			Update obj3=new Update();
			obj3.updatedata();
				break;
			case 4:
				Delete obj4=new Delete();
			obj4.deletedata();
			break;
			case 5:
				return;
			}
		}while(n!=0);
		}


	}


