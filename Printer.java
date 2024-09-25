import java.util.concurrent.TimeUnit;

public class Printer {

    public static void main(String[] args) {
        // Check if the NAME parameter is provided
        if (args.length != 1) {
            System.out.println("Please provide a NAME as a parameter.");
            return;
        }

        String name = args[0];

        // Print the hello message for 15 iterations
        for (int i = 1; i <= 15; i++) {
            System.out.println("Hello I am" + name + "and I am printing the number" + i);
            // Wait for 5 seconds
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                System.err.println("Sleep interrupted: " + e.getMessage());
            }
        }
    }
}
