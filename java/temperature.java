import java.util.*;
import java.io.*;
import java.math.*;

public class temperature {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int b = in.nextInt();
            int t = in.nextInt();
            t = ((t * 9) / 5) + 32;
            if (b == n) {
                System.out.println("Same");

            } else if (b < t) {
                System.out.println("Lower");

            } else if (b > t) {
                System.out.println("Higher");
            }
        }

    }

}
