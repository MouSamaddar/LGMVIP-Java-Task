import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        int choice;

        do {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Square Root");
            System.out.println("6. Trigonometric Functions");
            System.out.println("7. Logarithm");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;                
                case 5:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Square root: " + Math.sqrt(num1));
                    break;
                case 6:
                    handleTrigonometricFunctions(scanner);
                    break;
                case 7:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Logarithm base 10: " + Math.log10(num1));
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 8);
        
        scanner.close();
    }

    public static void handleTrigonometricFunctions(Scanner scanner) {
        int choice;
        double angle;

        do {
            System.out.println("Trigonometric Functions Menu:");
            System.out.println("1. Sine");
            System.out.println("2. Cosine");
            System.out.println("3. Tangent");
            System.out.println("4. Exit Trigonometric Functions");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter angle in degrees: ");
                    angle = scanner.nextDouble();
                    System.out.println("Sine: " + Math.sin(Math.toRadians(angle)));
                    break;
                case 2:
                    System.out.print("Enter angle in degrees: ");
                    angle = scanner.nextDouble();
                    System.out.println("Cosine: " + Math.cos(Math.toRadians(angle)));
                    break;
                case 3:
                    System.out.print("Enter angle in degrees: ");
                    angle = scanner.nextDouble();
                    System.out.println("Tangent: " + Math.tan(Math.toRadians(angle)));
                    break;
                case 4:
                    System.out.println("Exiting Trigonometric Functions...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 4);
    }
}
