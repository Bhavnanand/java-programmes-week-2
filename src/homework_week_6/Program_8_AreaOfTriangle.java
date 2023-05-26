package homework_week_6;

import java.util.Scanner;

/**Write a program to calculate thwe area of a triangle.
 */
public class Program_8_AreaOfTriangle
{
    public static void main (String []args){
        //Scanner declaration for reading input frm console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the triangle : ");
        int length = scanner.nextInt();
        System.out.println("Please enter the height of the triangle : ");
        int height = scanner.nextInt();
        areaofTeiangle(height,length);
        //closing the scanner object
        scanner.close();
    }
  // calcu;ating the area of triangle with no return type wth parameter method
  public static void areaofTeiangle(int length,int height)
  {
      int area = (length * height)/2;
      System.out.println("The area of a triangle is : "+area);
  }
}
