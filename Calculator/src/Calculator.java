import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0;
        for(;;) 
        {
            System.out.println("-------Menu-------");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.println(" Please select your choice (1-5):");
            int choice = scanner.nextInt();
            if (choice == 5) {
                return;
            } else
            {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        System.out.println("===============");
                        System.out.println("Result: " + result);
                        System.out.println("===============");
                        System.out.println("                ");
                        break;

                    case 2:
                        result = num1 - num2;
                        System.out.println("===============");
                        System.out.println("Result: " + result);
                        System.out.println("===============");
                        System.out.println("                ");
                        break;

                    case 3:
                        result = num1 * num2;
                        System.out.println("===============");
                        System.out.println("Result: " + result);
                        System.out.println("===============");
                        System.out.println("                ");
                        break;

                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("===============");
                            System.out.println("Result: " + result);
                            System.out.println("===============");
                            System.out.println("                ");
                        } else {
                            System.out.println("Error: Cannot divide by zero!");
                            scanner.close();
                            return;
                        }
                        break;
                    default:
                        System.out.println("Invalid operation!");
                        System.out.println("                ");
                }
            }
        }
    }
}
