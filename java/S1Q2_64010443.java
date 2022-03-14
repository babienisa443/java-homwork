import java.util.*;

public class S1Q2_64010443 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] s = { { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" },
                { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" } };
        System.out.print("Random characters are ");
        int r = (int) (Math.random() * 2);
        for (int i = 0; i < 10; i++) {
            int t = (int) (Math.random() * 10);
            while (s[r][t] == "x") {
                t = (int) (Math.random() * 10);
            }
            System.out.print(s[r][t] + " ");
            s[r][t] = "x";
            r++;
            r %= 2;
        }
        System.out.print("\nSelect group of characters[1] characters or [2] numberic: ");
        int index = in.nextInt();
        if (index == 1) {
            System.out.print("Characters not in the list are: ");
            for (int i = 0; i < 10; i++) {
                if (s[0][i] != "x")
                    System.out.print(s[0][i] + " ");
            }
        } else if (index == 2) {
            System.out.print("Numberics not in the list are: ");
            for (int i = 0; i < 10; i++) {
                if (s[1][i] != "x")
                    System.out.print(s[1][i] + " ");
            }
        } else {
            System.out.println("Please Enter again (1 or 2)");
        }
        System.out.println("\nEnd of program.");
        in.close();
    }
}
