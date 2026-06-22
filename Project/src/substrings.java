import java.util.Scanner;

public class substrings {
    public static void main(String[] args){

        // Scanner as input
        Scanner input = new Scanner(System.in);

        // Declare Variables
        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");

        // User input into email variable
        email = input.nextLine();


        // Verify that there is "@" in email
        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@")); // Ends at "@"
            domain = email.substring(email.indexOf("@") + 1); // Adds one more index so "@" won't be included

            System.out.printf("Your username is %s\n", username);
            System.out.printf("Your domain is %s\n", domain);
        }
        else{
            System.out.println("Your email must contain @");
        }
    }
}
