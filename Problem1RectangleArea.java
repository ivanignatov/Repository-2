/**
 * Created by John on 22-Mar-16.
 */


// Lets' comment some lines in order to test Git
package javaSyntaxix;
import java.util.Scanner;
public class Problem1RectangleArea {
    public static void main(String[] args) {
        System.out.println("Please specify side a and b of Rectangle, in order to find the area: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String arr[] = input.split(" ");
        int rectangleWidth = Integer.parseInt(arr[0]);
        int rectangleHeight = Integer.parseInt(arr[1]);
        System.out.println("The Area of the Rectangle is: ");
        System.out.println(rectangleHeight*rectangleWidth);
    }
}
