/*
 * Created by Mike Davidovich on 7/5/16.
 * Last modified 7/5/2016
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Davidovich_A02Q2 {

    /*
    This program take user input for the perimeter (s) and lenghts of three sides of a triangle (a,b,c)
    to calcualte the area of a triangle.
     */

    public static void main(String[] args)
    {
        double perimeter, side_a, side_b, side_c, area; // Initalizes variables.

        Scanner scan = new Scanner(System.in);

        System.out.print("What is s? ");                // Gathers user input.
        perimeter = scan.nextDouble();
        System.out.println();
        System.out.print("What is a? ");
        side_a = scan.nextDouble();
        System.out.println();
        System.out.print("What is b? ");
        side_b = scan.nextDouble();
        System.out.println();
        System.out.print("What is c? ");
        side_c = scan.nextDouble();
        System.out.println();

        DecimalFormat fmt = new DecimalFormat("0.###"); // Formats output to 3 decimal places.

        area = Math.sqrt(perimeter*(perimeter-side_a)*(perimeter-side_b)*(perimeter-side_c));  // Calculation of area.

        System.out.print("The area is " + fmt.format(area));

    }

}
