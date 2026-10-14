

    static boolean isAnagram(String a, String b) {
        if(a==null||b==null||a.length()!=b.length()){
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        int[]frequencies = new int;
        for(int i =0;i<a.length();i++){
            frequencies[a.charAT(i)-'a']++;
            frequencies[b.charAT(i)-'a']--;
        }
            for(int count:frequencies){
                if(count!=0){
                    return false;
                }
            }
            return true;
            
        }
        
        
        // Complete the function
    


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna