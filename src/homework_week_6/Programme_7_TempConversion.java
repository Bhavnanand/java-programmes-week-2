package homework_week_6;

import java.util.Scanner;

/**Write a program to insert any temperature value in degree Fahrenheit
 * and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme_7_TempConversion
{
    public static void main(String[] args) {
        //Scanner declarationfor reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature in fahrenheit :");
        float temp = scanner.nextFloat();
        //object creation
        Programme_7_TempConversion t = new Programme_7_TempConversion();
        t.convetTempToDegreeCelsius(temp);
        // closing the scanner object
        scanner.close();
    } //Tempraturw conversion method
    public void convetTempToDegreeCelsius(float temp)
    {
        float c = (temp-32)*5/9;
        System.out.println("The temperature "+temp+"fahrenheit is equal to "+c+"degreecelcius");
    }

}
