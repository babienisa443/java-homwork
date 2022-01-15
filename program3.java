import java.util.*;
import java.math.*;

public class program3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number between 0-1000 : ");
        int n = in.nextInt();
        int sum = 0;

        while (n != 0) {

            sum += n % 10;

            n /= 10;

        }
        System.out.print("sum of the digit : " + sum);
        if (n > 1000)
            System.out.print("out of range");
    }

}
