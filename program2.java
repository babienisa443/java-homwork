import java.util.*;
import java.math.*;

public class program2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of a :");
        double a = in.nextDouble();
        System.out.print("Enter value of b :");
        double b = in.nextDouble();
        System.out.print("Enter value of c :");
        double c = in.nextDouble();
        System.out.print("Enter value of d :");
        double d = in.nextDouble();
        System.out.print("Enter value of e :");
        double e = in.nextDouble();
        System.out.print("Enter value of f :");
        double f = in.nextDouble();

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);
        System.out.printf("value of x = %f\n", x);
        System.out.printf("value of y =%f", y);
        in.close();

    }
}
