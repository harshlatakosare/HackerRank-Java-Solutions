

class Checker implements Comparator<Player> {
    @Override
    public int compare(Player a,Player b) {
        if (a.score == b.score) {
            return a.name.compareTo(b.name);
        }
        return Integer.compare(b.score, a.score);
    }
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna