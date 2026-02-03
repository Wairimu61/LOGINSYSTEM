import java.io.Console;

public class LoginSystem {

    public static void main(String[] args) {

        String correctUsername = "Ann001";
        String correctPassword = "admin1";

        Console console = System.console();

        if (console == null) {
            System.out.println("Console not available. Please run from terminal.");
            return;
        }

        int attempts = 3;
        boolean firstRun = true;

        while (true) { 

            while (attempts > 0) {

                if (!firstRun) {
                    System.out.println("\nLogin Attempt (" + attempts + " remaining)");
                }

                String username = console.readLine("Enter username: ");
             
                if (!username.matches("[a-zA-Z0-9]+")) {
                    System.out.println("Invalid username. Only letters and numbers are allowed.");
                    continue;
                }

                char[] passwordArray = console.readPassword("Enter password: ");
                String password = new String(passwordArray);

                if (username.equals(correctUsername) && password.equals(correctPassword)) {
                    System.out.println("\nLogin successful. Welcome, " + username + "!");
                    return;
                } else {
                    attempts--;
                    firstRun = false;
                    System.out.println("Incorrect username or password.");

                    if (attempts > 0) {
                        System.out.println("Please try again.");
                    }
                }
            }

            System.out.println("\nToo many failed attempts.");
            System.out.println("Please wait 30 seconds before trying again...");

            try {
                Thread.sleep(30000); 
            } catch (InterruptedException e) {
                System.out.println("Timer interrupted.");
            }

            attempts = 3;
            firstRun = true;
            System.out.println("\nYou may now try logging in again.\n");
        }
    }
}
