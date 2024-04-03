import java.util.*;
public class String{

    public static void main(String[] args) {

        String str1 = "Hello, World!";
        String str2 = new String();
        char[] charArray = {'J', 'a', 'v', 'a'};
        String str3 = new String(charArray);
        byte[] byteArray = {65, 66, 67, 68}; 
        String str4 = new String(byteArray); 

        System.out.println("String Constructors:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);

        System.out.println("\nString Methods:");

        System.out.println("Length of str1: " + str1.length());

        String concatenatedStr = str1.concat(" Welcome");
        System.out.println("Concatenated String: " + concatenatedStr);
        char charAtIndex = str1.charAt(7);
        System.out.println("Character at index 7 in str1: " + charAtIndex);
        String substring = str1.substring(7, 12);
        System.out.println("Substring from index 7 to 12 in str1: " + substring);
        int indexOfWorld = str1.indexOf("World");
        System.out.println("Index of 'World' in str1: " + indexOfWorld);
        String replacedStr = str1.replace('o', '0');
        System.out.println("String after replacing 'o' with '0': " + replacedStr);
        System.out.println("Uppercase str1: " + str1.toUpperCase());
        System.out.println("Lowercase str1: " + str1.toLowerCase());
    }
}