import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s=s.trim();
        if(s.length()==0){
            System.out.println(0);
        }else{
            String[] tokens=s.split("[!,?._'@ ]+");
            System.out.println(tokens.length);
            for(String token:tokens){
                System.out.println(token);
                }
        }
            
        // Write your code here.
        scan.close();
    }
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna