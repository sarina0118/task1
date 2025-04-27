import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int product = 1;
        int num = number; 

       
        number = Math.abs(number);

        
        while (number > 0) {
            int digit = number % 10; 
            product *= digit;         
            number /= 10;             
        }

        System.out.println("The product of the digits is: " + product);
        scanner.close();
    }
}
