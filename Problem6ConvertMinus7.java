/**
 * Created by John on 22-Mar-16.
 */

import java.util.Scanner;
public class Problem6ConvertMinus7{
    public static void main(String[] args) {
        System.out.println("Please enter base-7 type number intended for convertion to decimal: ");
        Scanner skener = new Scanner(System.in);
        String numberConvertion = skener.next();
        try {
            Integer decimalConvertion = Integer.valueOf(numberConvertion, 7);
            System.out.println("Converted to decimal type number is: " + decimalConvertion);
        }catch (NumberFormatException e) {
            System.out.println("This number is not base-7 type. Please try with a different type of number.");
        }
    }
}
