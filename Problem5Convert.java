/**
 * Created by John on 22-Mar-16.
 */

import java.util.Scanner;
public class Problem5Convert {
    public static void main(String[] args) {
        System.out.println("Please enter the number for convertion to 7 base: ");
        Scanner skener = new Scanner(System.in);
        Integer numberconvertion = skener.nextInt();
        System.out.print("Converted to 7 number is: " + Integer.toString(numberconvertion, 7));
    }
}
