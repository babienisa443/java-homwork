import java.util.*;
import java.math.*;

public class program1 {
    public static void main(String[] args) {
        double b = 60 / 7.0;
        double d = 60 / 13.0;
        double I = 60 / 45.0;
        int a = 312032486;
        b = b * 24 * 60 * 365;
        d = d * 24 * 60 * 365;
        I = I * 24 * 60 * 365;
        System.out.println((int) (((b + I) - d)) + a);
        System.out.println((int) (((b + I) - d) * 2) + a);
        System.out.println((int) (((b + I) - d) * 3) + a);
        System.out.println((int) (((b + I) - d) * 4) + a);
        System.out.println((int) (((b + I) - d) * 5) + a);

    }
}