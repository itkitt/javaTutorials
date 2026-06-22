public class stringmethods {
    public static void main(String[] args){

        String name = "Evangeline";

        // Length checker
        int length = name.length();

        // Character selector
        char letter = name.charAt(0);

        // Find the first index's position
        int index = name.indexOf("e");

        // Find last index, last character's position
        int lastindex = name.lastIndexOf("e");

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastindex);

    }
}
