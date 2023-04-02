import java.util.Scanner;

public class Console_Calculator {
    private static void displayMenu() {
        System.out.println("Calculator Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Percentage");
        System.out.println("6. Factorial");
        System.out.println("7. Square");
        System.out.println("8. Cube");
        System.out.println("9. Square Root");
        System.out.println("10. a Power b");
        System.out.println("11. a Root b");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }
    
    private static void add(Scanner scanner) {
        System.out.print("Enter two numbers separated by space: ");
        try {
            String[] inputs = scanner.nextLine().split(" ");
            double n1 = Double.parseDouble(inputs[0]);
            double n2 = Double.parseDouble(inputs[1]);
            double res = n1 + n2;
            System.out.println("Result: " + res);
        } catch (Exception e) {
            System.out.println("Invalid input, try again.");
        }
    }
    
    private static void sub(Scanner scanner) {
        System.out.print("Enter two numbers separated by space: ");
        try {
            String[] inputs = scanner.nextLine().split(" ");
            double n1 = Double.parseDouble(inputs[0]);
            double n2 = Double.parseDouble(inputs[1]);
            double res = n1 - n2;
            System.out.println("Result: " + res);
        } catch (Exception e) {
            System.out.println("Invalid input, try again.");
        }
    }
    
    private static void mul(Scanner scanner) {
        System.out.print("Enter two numbers separated by space: ");
        try {
            String[] inputs = scanner.nextLine().split(" ");
            double n1 = Double.parseDouble(inputs[0]);
            double n2 = Double.parseDouble(inputs[1]);
            double res = n1 * n2;
            System.out.println("Result: " + res);
        } catch (Exception e) {
            System.out.println("Invalid input, try again.");
        }
    }

    private static void div(Scanner scanner) {
        System.out.print("Enter two numbers separated by space: ");
        try {
            String[] inputs = scanner.nextLine().split(" ");
            double n1 = Double.parseDouble(inputs[0]);
            double n2 = Double.parseDouble(inputs[1]);
            if (n2 == 0) {
                System.out.println("Division by zero is not allowed.");
            } else {
                double res = n1 / n2;
                System.out.println("Result: " + res);
            }
        } catch (Exception e) {
            System.out.println("Invalid input, try again.");
        }
    }
    
    private static void percent(Scanner scanner) {
        System.out.print("Enter two numbers separated by space: ");
        try {
            String[] inputs = scanner.nextLine().split(" ");
            double n1 = Double.parseDouble(inputs[0]);
            double n2 = Double.parseDouble(inputs[1]);
            double res = (n1 / 100) * n2;
            System.out.println("Result: " + res);
        } catch (Exception e) {
            System.out.println("Invalid input, try again.");
        }
    }
    
    private static void fact(Scanner scanner) {
        System.out.print("Enter a positive integer: ");
        try {
            int n = Integer.parseInt(scanner.nextLine());
            if (n < 0) {
                System.out.println("Invalid input, try again.");
            } else {
                int res = 1;
                for (int i = 1; i <= n; i++) {
                    res *= i;
                }
                System.out.println("Result: " + res);
            }
        } catch (Exception e) {
            System.out.println("Invalid input, try again.");
        }
    }
    
    private static void square(Scanner scanner) {
        System.out.print("Enter a number: ");
        try {
            double n = Double.parseDouble(scanner.nextLine());
            double res = n * n;
            System.out.println("Result: " + res);
        } catch (Exception e) {
            System.out.println("Invalid input, try again.");
        }
    }
    
    private static void cube(Scanner scanner) {
        System.out.print("Enter a number: ");
        try {
            double n= Double.parseDouble(scanner.nextLine());
            double res = n * n * n;
            System.out.println("Result: " + res);
        } catch (Exception e) {
            System.out.println("Invalid input, try again.");
        }
    }
    
    private static void sqrt(Scanner scanner) {
        System.out.print("Enter a non-negative number: ");
        try {
            double n = Double.parseDouble(scanner.nextLine());
            if (n < 0) {
                System.out.println("Invalid input, try again.");
            } else {
                double res = Math.sqrt(n);
                System.out.println("Result: " + res);
            }
        } catch (Exception e) {
            System.out.println("Invalid input, try again.");
        }
    }
    
    private static void power(Scanner scanner) {
        System.out.print("Enter two numbers separated by space: ");
        try {
            String[] inputs = scanner.nextLine().split(" ");
            double n1 = Double.parseDouble(inputs[0]);
            double n2 = Double.parseDouble(inputs[1]);
            double res = Math.pow(n1, n2);
            System.out.println("Result: " + res);
        } catch (Exception e) {
            System.out.println("Invalid input, try again.");
        }
    }
    
    
    private static void root(Scanner scanner) {
        System.out.print("Enter two positive numbers separated by space: ");
        try {
            String[] inputs = scanner.nextLine().split(" ");
            double n1 = Double.parseDouble(inputs[0]);
            double n2 = Double.parseDouble(inputs[1]);
            if (n1 < 0 || n2 < 0) {
                System.out.println("Invalid input, try again.");
            } else {
                double result = Math.pow(n1, 1 / n2);
                System.out.println("Result: " + result);
            }
        } catch (Exception e) {
            System.out.println("Invalid input, try again.");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    add(scanner);
                    break;
                case "2":
                    sub(scanner);
                    break;
                case "3":
                    mul(scanner);
                    break;
                case "4":
                    div(scanner);
                    break;
                case "5":
                    percent(scanner);
                    break;
                case "6":
                    fact(scanner);
                    break;
                case "7":
                    square(scanner);
                    break;
                case "8":
                    cube(scanner);
                    break;
                case "9":
                    sqrt(scanner);
                    break;
                case "10":
                    power(scanner);
                    break;
                case "11":
                    root(scanner);
                    break;
                case "12":
                    System.out.println("Exiting calculator app. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}

    
    
