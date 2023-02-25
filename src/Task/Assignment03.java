
package Task;

import java.util.Scanner;

public class Assignment03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input at least 20 personal details
        System.out.println("Please enter your personal details:");
        System.out.print("Given Name: ");
        String gname = scanner.nextLine();
        System.out.print("Maiden Name: ");
        String mname = scanner.nextLine();
        System.out.print("Family Name: ");
        String fname = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Occupation: ");
        String occupation = scanner.nextLine();
        System.out.print("Education level: ");
        String educationLevel = scanner.nextLine();
        System.out.print("Nationality: ");
        String nationality = scanner.nextLine();
        System.out.print("Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Marital status: ");
        String maritalStatus = scanner.nextLine();
        System.out.print("Religion: ");
        String religion = scanner.nextLine();
        System.out.print("Height (in cm): ");
        double height = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Weight (in kg): ");
        double weight = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Blood type: ");
        String bloodType = scanner.nextLine();
        System.out.print("Allergies: ");
        String allergies = scanner.nextLine();
        System.out.print("Chronic illnesses: ");
        String chronicIllnesses = scanner.nextLine();
        System.out.print("Emergency contact name: ");
        String emergencyContactName = scanner.nextLine();
        System.out.print("Emergency contact phone number: ");
        String emergencyContactPhoneNumber = scanner.nextLine();

        // Display the personal details in the console
        System.out.println("\nPersonal Details:");
        System.out.println("Name: " + fname + ", " + gname + " " + mname.charAt(0)+ ".");
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Occupation: " + occupation);
        System.out.println("Education level: " + educationLevel);
        System.out.println("Nationality: " + nationality);
        System.out.println("Gender: " + gender);
        System.out.println("Marital status: " + maritalStatus);
        System.out.println("Religion: " + religion);
        System.out.println("Height (in cm): " + height);
        System.out.println("Weight (in kg): " + weight);
        System.out.println("Blood type: " + bloodType);
        System.out.println("Allergies: " + allergies);
        System.out.println("Chronic illnesses: " + chronicIllnesses);
        System.out.println("Emergency contact name: " + emergencyContactName);
        System.out.println("Emergency contact phone number: " + emergencyContactPhoneNumber);

        scanner.close();
    }
}
