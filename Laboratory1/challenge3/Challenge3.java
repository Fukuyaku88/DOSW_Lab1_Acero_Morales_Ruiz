import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenge3 {

    public static Function<String, String> string_builder = str -> {

        StringBuilder builder = new StringBuilder();

        Stream.generate(() -> str)
                .limit(3)
                .forEach(s -> builder.append(s).append(" "));

        return builder.toString();
        
    };

    public static void main(String[] args) {
        String str = "Hello World and cats";

        System.out.println(string_builder.apply(str.trim()));
    }
}
