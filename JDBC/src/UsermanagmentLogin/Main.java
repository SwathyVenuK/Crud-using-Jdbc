package UsermanagmentLogin;

import java.sql.SQLException;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int n;
		Scanner s=new Scanner(System.in);
		do{
		System.out.println("1.insert\n2.login\n3.Exit");
		n=s.nextInt();
		//Insert obj1=new Insert();
		switch(n)
		{
		case 1:
	Insert obj1=new Insert();
			
		obj1.inser1tData();
			break;
	//	case 2:
	//	Login obj2=new Login();
	//	obj2.viewlogin();
	//		break;
		
		case 3:
			return;
		}
	}while(n!=0);
	}


}


