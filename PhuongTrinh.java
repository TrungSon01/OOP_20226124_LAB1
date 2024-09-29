
import java.util.Scanner;

public class PhuongTrinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the type of equation to solve:");
        System.out.println("1. Linear Equation (ax + b = 0)");
        System.out.println("2. System of Linear Equations (a11x1 + a12x2 = b1 and a21x1 + a22x2 = b2)");
        System.out.println("3. Quadratic Equation (ax^2 + bx + c = 0)");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                solveLinearEquation(scanner);
                break;
            case 2:
                solveSystemOfLinearEquations(scanner);
                break;
            case 3:
                solveQuadraticEquation(scanner);
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }

    private static void solveLinearEquation(Scanner scanner) {
        System.out.print("Enter coefficients a and b (ax + b = 0): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Coefficient a cannot be zero.");
        } else {
            double x = -b / a;
            System.out.println("The solution is: x = " + x);
        }
    }

    private static void solveSystemOfLinearEquations(Scanner scanner) {
        System.out.print("Enter coefficients a11, a12, b1, a21, a22, b2: ");
        double a11 = scanner.nextDouble();
        double a12 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double a21 = scanner.nextDouble();
        double a22 = scanner.nextDouble();
        double b2 = scanner.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("The system has infinitely many solutions.");
            } else {
                System.out.println("The system has no solution.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("The solution is: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    private static void solveQuadraticEquation(Scanner scanner) {
        System.out.print("Enter coefficients a, b, c (ax^2 + bx + c = 0): ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("Coefficient a cannot be zero.");
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("The solutions are: x1 = " + root1 + ", x2 = " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("The solution is a double root: x = " + root);
            } else {
                System.out.println("The equation has no real roots.");
            }
        }
    }
}
