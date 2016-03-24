/**
 * Created by John on 22-Mar-16.
 */
import java.util.Scanner;

public class Problem4CalculateExpression {
    public static void main(String[] args) {
        System.out.println("Please enter three floating point numbers: ");
        double float1, float2, float3;
        double a, b, c;
        double float12, float13,float14,float15;
        Scanner scan = new Scanner(System.in);
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        float12 = ((a*a) + (b*b)) / ((a*a) - (b*b));
        float13 = (a+b+c) / (Math.sqrt(c));
        float1 = Math.pow(float12, float13);
        float14 = (a*a) + (b*b) - (c*c*c);
        float15 = (a-b);
        float2 = Math.pow(float14, float15);
        float3 = Math.abs(((a+b+c)/3) - ((float1+float2)/2));
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",float1,float2,float3);
    }
}