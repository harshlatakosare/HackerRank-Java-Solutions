    import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();

            
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            
            deque.add(num);
            map.put(num, map.getOrDefault(num, 0) + 1);
            
            if (deque.size() == m) {
                if (map.size() > maxUnique) {
                    maxUnique = map.size();
                }
                
                int first = (int)deque.remove();
                int count = map.get(first);
                if (count == 1) {
                    map.remove(first);
                } else {
                    map.put(first, count - 1);
                }
            }
        }
        System.out.println(maxUnique);
    }
}
               






// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna