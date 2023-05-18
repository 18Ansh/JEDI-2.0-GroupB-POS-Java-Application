/**
 * 
 */
package com.flipkart.client;
import java.util.*;
import com.flipkart.service.*;
/**
 * @author ansh.agarwal
 *
 */
public class CRSApplicationClient {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int choice;
		System.out.println("Welcome to CRS Application");
		System.out.println("MENU FOR OPERARION");
		System.out.println("1. Login");
		System.out.println("2. Registration of the Student");
		System.out.println("3. Update Password");
		System.out.println("4. Exit");
		Scanner scn=new Scanner(System.in);
		choice=scn.nextInt();
		switch(choice)
		{
			case 1 :  
				LoginOperationService login=new LoginOperationService();
				String username, password, role;
				System.out.println("Enter name: ");
			    username=scn.nextLine();
					  System.out.println("Enter password: ");
					  password=scn.nextLine();
					  System.out.println("Enter role: ");
					  role=scn.nextLine();
					  login.show();
					  if(role.equals("Student"))
					  {
						 CRSStudentMenu.displayMenu();
						  
					  }
					  break;
			case 2 :  
			case 3 :
			case 4 :
			default: System.out.println("PLease enter a valid choice.");
		}
		scn.close();
		
	}

}
