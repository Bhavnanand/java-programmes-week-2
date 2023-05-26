package homework_week_6;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */
public class Programme_19_convertStringToLowerCase
{
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase sentence: ");
        String uppercase = scanner.nextLine();
        Programme_19_convertStringToLowerCase t = new Programme_19_convertStringToLowerCase();
        t.convertStringToLowerCase(uppercase);
        //Clolsing the scanner object
        scanner.close();
    }
    //conver string to lower case
    public void convertStringToLowerCase(String str)
    {
        System.out.println("The Lowercase of the the string is ="+str.toLowerCase());
    }
}
