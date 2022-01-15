import java.util.*;
import java.math.*;

public class program4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter weight: ");
        double weight = in.nextDouble();
        System.out.print("Enter height: ");
        double height = in.nextDouble();

        weight *= 0.45359237;
        height *= 0.0254;
        double BMI = weight / (height * height);
        System.out.print("BMI= " + BMI);

    }

}
