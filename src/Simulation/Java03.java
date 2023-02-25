package Simulation;

// getting user input with Scanner class

import java.util.Scanner;   //importing the Scanner class to get user input

public class Java03 {
  
    public static void main(String[] args) {
        
        //creating a scanner io object name for input
        Scanner io = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String username = io.nextLine();
        System.out.print("Enter password: ");
        String password = io.nextLine();
        System.out.println("\nUsername: " + username + "\tPassword: " + password);
        
        //declaring variables for input
        String firstName, lastName, gender, marStatus;
        long mobNum;
        int age;
        
        System.out.print("\nEnter first name: ");
        firstName = io.nextLine();
        System.out.print("Enter last name: ");
        lastName = io.nextLine();
        System.out.print("Enter mobile number: ");
        mobNum = io.nextLong();
        
        io.nextLine();   //clearing the scanner object for next input
        
        System.out.print("Enter marital status: ");
        marStatus = io.nextLine();
        System.out.print("Enter age: ");
        age = io.nextInt();
        
        System.out.println("\n\tMY PROFILE\nName: " + firstName + " " + lastName);
        System.out.println("Mobile Number: " + mobNum + "\nMarital Status: " + marStatus + "\nAge: " + age);
        
        io.close(); //closing the scanner io object
    }
}