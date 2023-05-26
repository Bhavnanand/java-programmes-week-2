package homework_week_6;

import java.util.Scanner;

public class Programme_9_ConvertUpperToLowerCase {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scaner =new Scanner(System.in);
        System.out.println("Enter the upper case string");
        String uppercase =scaner.nextLine();
        Programme_9_ConvertUpperToLowerCase t = new Programme_9_ConvertUpperToLowerCase();
        t.convertUpperCaseToLowerCase(uppercase);
        //closing the scanner object
        scaner.close();
    }
    //conversion to Uppercse to lower case method
    public void convertUpperCaseToLowerCase(String text)
    {
        System.out.println("The lower case value is ="+text.toLowerCase());
    }
}
