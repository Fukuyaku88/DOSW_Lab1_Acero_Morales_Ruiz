import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Challenge6 {

    //Student A version
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

    //Student B Version
    private static void executeCommandB(String command, Map<String,Runnable> actions) {
        Runnable response = actions.get(command);
        response.run();
    }

    public static void main(String[] args) {

        Map<String, Runnable> actions = new HashMap<>(); //Map that contains the Student B commands, is here because it is 
        actions.put("JOKE", () -> System.out.println("Why did the RAM break up with the CPU? It needed space."));
        actions.put("SHOUT", () -> System.out.println("STACK OVERFLOW ALERT!"));
        actions.put("WHISPER", () -> System.out.println("Shhh... the bugs are sleeping."));
        actions.put("ANALYZE", () -> System.out.println("Processing data... result: You are amazing at programming!"));

        ArrayList<String> commandsA = new ArrayList<>(Arrays.asList("GREET", "FAREWELL", "SING", "DANCE"));

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Type the command: ");

            String command = scan.nextLine().trim();

            if (command.equals("EXIT")) {
                break;
            }
            if (commandsA.contains(command)) {
                executeCommandA(command);
            } else {
                executeCommandB(command,actions);
            }
        }

        scan.close();
    }
}