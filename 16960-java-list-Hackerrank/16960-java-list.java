import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        while (n-- > 0) list.add(sc.nextInt());
        int q = sc.nextInt();
        while (q-- > 0) {
            if (sc.next().equals("Insert")) {
                list.add(sc.nextInt(), sc.nextInt()); 
            } else {
                list.remove(sc.nextInt()); 
            }
        }
        for (int num : list) System.out.print(num + " ");
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna