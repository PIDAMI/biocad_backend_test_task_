import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String JSON_PATH = "src/main/resources/table.json";

    public static void main(String[] args) {
        System.out.println("Task 1: print Fibonacci numbers");
        int fibNumbersSize = 10;
        List<Integer> fibNumber = Fibonacci.fibNumbers(fibNumbersSize);
        fibNumber.forEach(System.out::println);

        System.out.println("Task 2: read data from json and print them as a table");
        try {
            JsonReader reader = new JsonReader(JSON_PATH);
            reader.print();
        } catch (IOException e) {
            System.out.println("json file not found");
        }
    }
}
