import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
         double sqrt = Math.sqrt(number);
         if (sqrt == (int) sqrt) {
            System.out.println(number + " is a perfect square.");
        } else {
            System.out.println(number + " is NOT a perfect square.");
        }

        scanner.close();
    }
}

