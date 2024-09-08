package emailapp;

import java.util.Scanner;

public class Email {
private String firstName;
private String lastName;
private String password;
private String email;
private String department;
private int mailboxCapacity;
private String alternateEmail;
private int defaultPasswordLength=10;
private String altEmail;

//Constructor to receive first name and last name

 public Email(String firstName, String lastName){
	
	this.firstName=firstName;
	this.lastName=lastName;
	System.out.println("EMAIL CREATED : "+firstName+" "+lastName);

	
	//	Call a method asking for the method
	this.department=setDepartment();
	System.out.println("DEPARTMENT : "+this.department);
	
	//Call a method that returns a random password 
	this.password=randomPassword(defaultPasswordLength);
	System.out.println("PASSWORD : \n"+this.password);
	
	
	this.email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+
			this.department+"."+"company"+"."+"com";
	System.out.println("EMAIL :\n"+this.email);
	}

//Ask for the department
private String setDepartment() {
	System.out.print("DEPARTMENT CODES\n1.For Sales\n2.For Development \n3.For "
			+ "Accounting \n0. For none\nEnter the Department Code\n");
	Scanner in=new Scanner(System.in);
	int depChoice=in.nextInt();
	if(depChoice==1) {
		return "sales";
	}
	else if(depChoice==2) {return "development";}
	else if(depChoice==3) {return "accounting";}
	else{return "";}
	
}

//Generate the random password
private String randomPassword(int length) {
	String passwordSet="ABCDEFGHIJKLMONPRSTUVWXYZ0123456789!@#$%";
//	char[]password=Defining array password  of char type
//	new char[length]=Allocating memory for the array password to store
//elements in it
	char[]password=new char[length];
	for(int i=0;i<length;i++) {
//		Math.random()=Generates random double value from 0.0 to 1.0(exclusive)
//      passwordSet.length()=gives the length of string 
//		ABCDEFGHIJKLMONPRSTUVWXYZ0123456789!@#$%=40
//      (int)... converts double result to int(round down)		
		int rand=(int)(Math.random()*passwordSet.length());
//		rand=0(inclusive)-40(exclusive)
		password[i]=passwordSet.charAt(rand);	
	}
	return new String (password);
}
public void setMailboxCapacity(int capacity) {this.mailboxCapacity=capacity;}
public int getMailboxCapacity() {return (this.mailboxCapacity);}
public void setAlternateEmail(String altEmail) {this.altEmail=altEmail;}
public String getAlternateEmail() {return this.altEmail;}
public void changePassword(String password) {this.password=password;}
public String getPassword() {return this.password;}
public String showInfo() {return "Name:\n"+this.firstName+this.lastName+"\n"
		+"Email\n"+this.email +"\nMail Box Capacity\n"+this.mailboxCapacity+" MB";}
}



