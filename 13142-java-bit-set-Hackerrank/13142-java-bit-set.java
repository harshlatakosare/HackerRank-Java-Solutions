import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BitSet[] b = new BitSet[3];
        b[1] = new BitSet(n);
        b[2] = new BitSet(n);
        
        for (int i=0;i<m;i++) {
            String op=sc.next();
            int x=sc.nextInt();
            int y=sc.nextInt();
            switch (op) {
                case "AND":
                    b[x].and(b[y]);
                    break;
                case "OR":
                    b[x].or(b[y]);
                    break;
                case "XOR":
                    b[x].xor(b[y]);
                    break;
                case "FLIP":
                    b[x].flip(y);
                    break;
                case "SET":
                    b[x].set(y);
                    break;
            }
            System.out.println(b[1].cardinality() + " " + b[2].cardinality());
        }
        sc.close();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna