
import java.util.Scanner;

public class GPAmain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        GPA gpa = new GPA();
        System.out.println("Typ math grade :");
        double math = in.nextDouble();
        System.out.println("Typ thai  grade :");
        double thai = in.nextDouble();
        System.out.println("Typ eng  grade :");
        double eng = in.nextDouble();
        in.nextLine();
        System.out.println("StudentId: ");

        String st = in.nextLine();
        gpa.setStudentId(st);
        System.out.println(gpa.getStudentId());
        gpa.setMathGrade(math);

        gpa.setEngGrade(math);
        System.out.println();
        gpa.setThaiGrade(math);
        System.out.println();
        System.out.println(gpa.fCheck());
    }
}
