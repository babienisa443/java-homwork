import java.util.*;
import java.math.*;

class Solution {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        int s = 1;
        for (int i = 0; i < n.length(); i++)
            s *= n.charAt(i) - 48;
        System.out.print(s);
    }
}