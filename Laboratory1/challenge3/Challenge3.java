import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Challenge3 {

    public static Function<String, String> mysteriousEcho = str -> {

        StringBuilder builder = new StringBuilder();

        Stream.generate(() -> str)
                .limit(3)
                .forEach(s -> builder.append(s).append(" "));

        return builder.toString();
        
    };

    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println(mysteriousEcho.apply(str.trim()));
    }
}
