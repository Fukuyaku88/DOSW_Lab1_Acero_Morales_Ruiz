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

    public static void main(String[] args) {

            executeCommandA("GREET");
            executeCommandA("FAREWELL");
            executeCommandA("SING");
            executeCommandA("DANCE");
    }
}