package utilities;

public class CheckAction {
    public void checkIfActionResponding() {
        try {
            // Wait for 5 seconds before proceeding with the next line of code
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // Handle the exception
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}