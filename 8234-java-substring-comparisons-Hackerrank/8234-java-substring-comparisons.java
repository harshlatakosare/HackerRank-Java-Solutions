

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
        for(int i=0;i<=s.length()-k;i++){
            String sub = s.substring(i,i+k);
            if(sub.compareTo(smallest)<0){
                smallest = sub;
            }
            if(sub.compareTo(largest)>0){
                largest = sub;
            }
            
        }
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna