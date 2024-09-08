package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter First Name\n");

	    String firstName = myObj.nextLine();  // Read user input
	   
	    
	    System.out.print("Enter Last  Name\n");

	    String lastName = myObj.nextLine();  // Read user input
	   
	    
		Email em1=new Email(firstName, lastName);
		em1.setAlternateEmail("alternateemail@gmail.com");
		System.out.println("ALTERNATE EMAIL:\n"+em1.getAlternateEmail());

		em1.changePassword("PasswordChange");
System.out.println("CHANGED PASSWORD:\n"+em1.getPassword());

em1.setMailboxCapacity(100);
System.out.println("MAIL BOX CAPACITY :\n"+em1.getMailboxCapacity()+" MB");
System.out.println("INFORMATION:\n"+em1.showInfo());



	}

}
