import java.util.Scanner;

public class UC3_UserInput {

    public static void main(String[] args) {
        int slot = getUserInput();
        System.out.println("You selected slot: " + slot);
    }

    static int getUserInput() {
        Scanner sc = new Scanner(System.in);
        int slot;

        while (true) {
            System.out.print("Enter a slot number (1-9): ");
            slot = sc.nextInt();

            if (slot >= 1 && slot <= 9) {
                return slot; 
            } else {
                System.out.println("Invalid input! Please enter a number between 1 and 9.");
            }
        }
    }
}
