/**
 * 
 */
package com.flipkart.client;
import java.util.Scanner;

/**
 * @author ramasamy.kandasamy
 *
 */
public class CRSApplicationClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scannerObj = new Scanner(System.in);
		int choice;
		
		System.out.println("Welcome to CRS Application");
		
		
		
		boolean interactWithClient = true;
		while(interactWithClient){
			// Take input choice until the user chooses to exit.
			System.out.println("Select one of the following choices by inputting the choice number:");
			System.out.println("1. Login");
			System.out.println("2. New student registration");
			System.out.println("3. Update Password");
			System.out.println("4. Exit");

			// Get user choice and act on it.
			choice = scannerObj.nextInt();
			scannerObj.nextLine();
			switch(choice) {
			case 1:
				System.out.println("You have chosen: 1. Login");
				login();
				break;
			case 2: 
				// Do new student registration.
				break;
			case 3:
				// Procedures for update password.
				break;
			case 4:
				interactWithClient = false; // Exit the service.
				break;
			default:
				System.out.println("Error!! Input valid choices.");
				// Write code to handle this.
			
			}
		}
		//scannerObj.close();
		
	}
	
	private static boolean login() {
		Scanner scannerObj = new Scanner(System.in);
		
		// Get ID.
		System.out.println("Enter your ID");
		int id = scannerObj.nextInt();
		scannerObj.nextLine(); // Consumes the empty return left by nextInt in the previous line.
		
		// Get Password.
		System.out.println("Enter your password");
		String password = scannerObj.nextLine();
		
		// Get user role.
		System.out.println("Enter you position");
		String role = scannerObj.nextLine();
		
		// Check if the user exists
		if(!userExists(id)) {
			System.out.println("You are not a verified user.");
			if(role.equals("Student")) {
				System.out.println("Register yourself as a new student");
			} else if(role.equals("Professor")) {
				System.out.println("Contact the Admin.");
			} else {
				// This condition should not happen.
				// Handle the exception. <-- TODO
			}
			return false;
		}
		
		
		// Check if password and role matches.
		if(!verifyPassword(id, password)) {
			return false;
		}
		
		if(!verifyRole(id, role)) {
			return false;
		}
		
		
		// Call user specific operations.
		
		if (role.equals("admin")) {
			CRSAdminMenu.process();
		} else if(role.equals("professor")) {
			CRSProfessorMenu.process();
		} else if(role.equals("student")) {
			CRSStudentMenu.process();
		} else {
			// Error. Handle the error.
			// May be this is not necessary as we check above if the role matches.ß
		}
		
		return true;
	}

	private static boolean userExists(int id) {
		// TODO Implement this function.
		return true;
	}
	
	private static boolean verifyPassword(int id, String inputPassword) {
		return true;
	}
	
	private static boolean verifyRole(int id, String inputRole) {
		return true;
	}
}



















