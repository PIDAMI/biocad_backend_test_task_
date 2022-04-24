import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static List<Integer> fibNumbers(int n) {
        List<Integer> fib = new ArrayList<>(n);
        fib.add(1);
        fib.add(1);
        for (int i = 2; i < n; i++) {
            fib.add(fib.get(i - 1) + fib.get(i - 2));
        }
        return fib;
    }
}
