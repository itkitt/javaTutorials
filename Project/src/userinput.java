import java.util.Scanner; // Importing tools

public class userinput {
    public static void main(String[] args){

        // Enabling scanner util
        Scanner scanner = new Scanner(System.in); // Accepts new user input

        // String Input (NAME)
        System.out.print("Enter your name: "); // No need println as it breaks the line (only adds the dialogue, no data input data stored)
        String name = scanner.nextLine(); // name variable (stores name here)

        // Integer Input (AGE)
        System.out.print("Enter your age: ");
        int age = scanner.nextInt(); // Next integer, not line

        // Double Input (GPA)
        System.out.print("What's your gpa: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine(); // Make sure that you're able to write string in the next input

        // Boolean Input (isStudent)
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // Opening Dialogue
        System.out.println("Hello, " + name + "!! You are " + age + " years old! Your gpa is " + gpa + "!");

        // If Statement
        if(isStudent){
            System.out.println("You are a student!");
        }
        else{
            System.out.println("You are not a student!");

        scanner.close(); // Close scanner



    }
}}