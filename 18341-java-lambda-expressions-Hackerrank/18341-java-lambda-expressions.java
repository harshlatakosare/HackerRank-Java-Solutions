
   // Write your code here
   public PerformOperation isOdd() {
        return (int a) -> a % 2 != 0;
    }
    public PerformOperation isPrime() {
        return (int a) -> java.math.BigInteger.valueOf(a).isProbablePrime(5);
    }
    public PerformOperation isPalindrome() {
        return (int a) -> Integer.toString(a).equals(new StringBuilder(Integer.toString(a)).reverse().toString());
    }
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna