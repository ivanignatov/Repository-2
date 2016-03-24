/**
 * Created by John on 22-Mar-16.
 */

package javaSyntaxix;
import java.util.Scanner;
public class Problem2TriangleArea {
    public static void main(String[] args){
        System.out.println("Please enter coordinates of the first angle (point): ");
        Scanner skener = new Scanner(System.in);
        String angle1 = skener.nextLine();
        String arr1[] = angle1.split(" ");
        int xt = Integer.parseInt(arr1[0]);
        int yt = Integer.parseInt(arr1[1]);
        System.out.println("Now enter coordinates of the second angle (point): ");
        String angle2 = skener.nextLine();
        String arr2[] = angle2.split(" ");
        int xt2 = Integer.parseInt(arr2[0]);
        int yt2 = Integer.parseInt(arr2[1]);
        System.out.println("Finally enter coordinates of the third angle (point): ");
        String angle3 = skener.nextLine();
        String arr3[] = angle3.split(" ");
        int xt3 = Integer.parseInt(arr3[0]);
        int xy3 = Integer.parseInt(arr3[1]);
        int plane = (xt*(yt2-xy3) + xt2*(xy3-yt) + xt3*(yt-yt2))/2;
        if(plane>=0) System.out.println("The triangle area is: " + plane);
        else System.out.println(plane*-1);
    }
}
