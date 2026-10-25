

        //Write your code here
        Arrays.sort(s, 0, n, new Comparator<String>() {
            public int compare(String a, String b) {
                BigDecimal bdA = new BigDecimal(a);
                BigDecimal bdB = new BigDecimal(b);
                return bdB.compareTo(bdA);
            }
            });



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna