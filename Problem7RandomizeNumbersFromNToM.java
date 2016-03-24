/**
 * Created by John on 22-Mar-16.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem7RandomizeNumbersFromNToM {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);
        System.out.println("Please enter an integer N: ");
        int n = skener.nextInt();
        System.out.println("Please enter an integer M: ");
        int m = skener.nextInt();
        int upperLimit = 0;
        int lowerLimit = 0;
        if (n > m) {
            upperLimit = n;
            lowerLimit = m;
        } else if (n < m) {
            upperLimit = m;
            lowerLimit = n;
        } else {
            System.out.println(n);
        }
        List<Integer> numbers = new ArrayList<>();
        for (int i = lowerLimit; i <= upperLimit; i++) {
            numbers.add(i);
            Collections.shuffle(numbers);
        }
        for (int item : numbers) {
            System.out.println(item);
        }
    }
}