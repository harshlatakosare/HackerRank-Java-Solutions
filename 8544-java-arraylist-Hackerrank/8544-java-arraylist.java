import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] lines = new int[n][];
        
        for (int i = 0; i < n; i++) {
            int d = scan.nextInt(); 
            lines[i] = new int[d];  
            
            for (int j = 0; j < d; j++) {
                lines[i][j] = scan.nextInt();
            }
        }
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt(); 
            int y = scan.nextInt(); 
            int r = x - 1;
            int c = y - 1;
            if (r >= 0 && r < lines.length && c >= 0 && c < lines[r].length) {
                System.out.println(lines[r][c]);
            } else {
                System.out.println("ERROR!");
            }
        }
        
        scan.close();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna