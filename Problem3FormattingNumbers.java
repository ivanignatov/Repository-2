/**
 * Created by John on 22-Mar-16.
 */

import java.util.Scanner;
public class Problem3FormattingNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter an integer a: ");
        Scanner skener = new Scanner(System.in);
        int a = skener.nextInt();
        System.out.println("Please enter a floating-point b: ");
        double b = skener.nextDouble();
        System.out.println("Please enter a floating-point c: ");
        double c = skener.nextDouble();
        System.out.print('|');
        System.out.print(String.format("%1$-10s", Integer.toHexString(a).toUpperCase()));
        System.out.print('|');
        System.out.print(String.format("%010d", Integer.parseInt(Integer.toBinaryString(a))));
        System.out.print('|');
        System.out.print(String.format("%1$10s", String.format("%.2f", b)));
        System.out.print('|');
        System.out.print(String.format("%1$-10s", String.format("%.3f", c)));
        System.out.print('|');
        System.out.println();
    }
}