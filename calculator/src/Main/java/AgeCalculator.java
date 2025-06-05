import java.util.Scanner;
public class AgeCalculator {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  // Read user input as an integer
        // Calculate the number of years left until the user is 100
        int yearsLeft = 100 - age;
        if (yearsLeft > 0) {
            System.out.println("You have " + yearsLeft + " years left until you turn 100.");
        } else if (yearsLeft == 0) {
            System.out.println("You are exactly 100 years old. Congratulations!");
        } else {
            System.out.println("You turned 100 " + (-yearsLeft) + " years ago!");
        }

        scanner.close();
    }
}