import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class JsonReader {
    private final Map<String, List<Integer>> table;
    private int maxLengthWord = 0;

    public JsonReader(final String path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        table = objectMapper.readValue(new File(path), new TypeReference<>() {});
        for (Entry<String, List<Integer>> entry: table.entrySet()) {
            maxLengthWord = Math.max(maxLengthWord, entry.getKey().length());
        }
    }

    public void print() {
        String format = "%-" + maxLengthWord + "s : ";
        table.forEach((String str, List<Integer> numbers) -> {
            System.out.printf(format, str);
            System.out.println(numbers);
        } );
    }
}
