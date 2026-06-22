public class variable {
    public static void main(String[] args){

        // To create variable:
        // 1) Declaration
        // 2) Assignment

        // Primitive data types; The actual value itself. (Stored in memory/stack)

        int age = 23; // Declaring variable 'age' is an integer, and it's 21
        int year = 2026;
        double price = 23.70; // More memory than float, uses decimals
        float gpa = 4.5f; // Float less memory, must append f at the end bc compiler treats all decimals as double, faster processing
        char grade = 'A'; // Char used for only one character, must use single quotations
        boolean isStudent = true; // Yes/No

        // Reference data types; points as reference; A memory address in the stack/memory, (reference) to where the data is stored, in the heap.
        String name = "Iki"; // Must use capital S

        System.out.println("The year is " + year + " and I am " + age + " years old."); // String consisting of variables
        System.out.println("The price for a mofusand is " + price + "RM and I am able to get it if I get " + gpa + " GPA this year.");

        // If Statement

        if(isStudent){
            System.out.println("My name is " + name + " and my grade is an " + grade);
        }
        else {
            System.out.println("Not a student!");
        }




    }



}
