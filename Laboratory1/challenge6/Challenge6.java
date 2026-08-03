import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Challenge6 {

    private static final Map<String, Runnable> actions = new HashMap<>();

    //Student A version, cause this is the final implementation this method is not used anymore, but it has been left here for professor review.
    private static void executeCommandA(String command) {
        switch (command) {
            case "GREET":
                System.out.println("Greetings, traveler of time and code!");
                break;
            case "FAREWELL":
                System.out.println("May the bits be with you until the next mission.");
                break;
            case "SING":
                System.out.println("01010101");
                break;
            case "DANCE":
                System.out.println("Spinning in party mode.");
                break;
        }
    }

    //Student B Version, in the final implementation, this one is totally used.
    private static void executeCommandB(String command, Map<String,Runnable> actions) {
        Runnable response = actions.get(command);
        response.run();
    }

    public static void main(String[] args) {

        actions.put("GREET", () -> System.out.println("Greetings, traveler of time and code!"));
        actions.put("FAREWELL", () -> System.out.println("May the bits be with you until the next mission."));
        actions.put("SING", () -> System.out.println("01010101"));
        actions.put("DANCE", () -> System.out.println("Spinning in party mode."));
        actions.put("JOKE", () -> System.out.println("Why did the RAM break up with the CPU? It needed space."));
        actions.put("SHOUT", () -> System.out.println("STACK OVERFLOW ALERT!"));
        actions.put("WHISPER", () -> System.out.println("Shhh... the bugs are sleeping."));
        actions.put("ANALYZE", () -> System.out.println("Processing data... result: You are amazing at programming!"));

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Type the command: ");

            String command = scan.nextLine().trim();

            if (command.equalsIgnoreCase("EXIT")) {
                break;
            } else if (command.isEmpty()) {
                System.out.println("Enter a correct command.");
            } else {
                executeCommandB(command, actions); /*Here can be a try catch to catch the error when the command is not correct, 
                but I think that this is enough. */
            }
        }

        scan.close();
    }
}