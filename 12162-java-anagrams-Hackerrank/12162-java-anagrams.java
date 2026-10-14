static boolean isAnagram(String a, String b) {
    if (a.length() != b.length()) {
        return false;
    }
    
    char[] charArrayA = a.toLowerCase().toCharArray();
    char[] charArrayB = b.toLowerCase().toCharArray();
    
    java.util.Arrays.sort(charArrayA);
    java.util.Arrays.sort(charArrayB);
    
    return java.util.Arrays.equals(charArrayA, charArrayB);
}
        
        
        // Complete the function
    


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
