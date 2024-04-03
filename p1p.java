import java.util.*;
class p1p{
public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Index of 'e' in str1: " + str1.indexOf('e'));
        System.out.println("Substring of str2 from index 1 to 3: " + str2.substring(1, 4));
        System.out.println("Character at index 2 in str1: " + str1.charAt(2));
        System.out.println("Replacing 'l' with 'p' in str1: " + str1.replace('l', 'p'));
        System.out.println("str2 in uppercase: " + str2.toUpperCase());
        System.out.println("str1 in lowercase: " + str1.toLowerCase());
        System.out.println("Comparing str1 with str2: " + str1.compareTo(str2));
        System.out.println("Are str1 and str2 equal? " + str1.equals(str2));
	System.out.println(str1);
    }
}