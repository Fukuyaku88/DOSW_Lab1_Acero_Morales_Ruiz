import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenge3 {
    public static Function<String, String> string_builder = str -> {
        String repeater = Stream.generate(() -> str).limit(3).collect(Collectors.joining(" "));
        return repeater;
    };

    public static void main(String[] args) {
        String str = "Hello World and cats";

        String result = string_builder.apply(str);
        System.out.println(result);
    }
}
