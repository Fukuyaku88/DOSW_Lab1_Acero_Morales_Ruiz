import java.util.function.Function;
import java.util.stream.Stream;

public class Challenge3 {
    public static Function<String, String> mysteriousEcho = str -> {
         StringBuilder builder = new StringBuilder();

        Stream.generate(() -> str)
                .limit(3)
                .forEach(s -> builder.append(s).append(" "));

        String repeatedMessage = builder.toString().trim();
        StringBuffer buffer = new StringBuffer(repeatedMessage);
        return buffer.reverse().toString();
    };


    public static void main(String[] args) {
        String message = "Hello World and cats";

        String result = mysteriousEcho.apply(message);
        System.out.println(result);
    }


}