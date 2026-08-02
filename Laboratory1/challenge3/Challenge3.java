import java.util.function.Function;
import java.util.stream.Stream;

public class Challenge3 {


    public static Function<String, String> mysteriousEcho = str -> {

        StringBuffer buffer = new StringBuffer(str);

        return buffer.reverse().toString();
    };



    public static void main(String[] args) {

        String message = "Hello World";

        System.out.println(mysteriousEcho.apply(message));

    }


}