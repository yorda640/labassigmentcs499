package Exercise;

public class QuadraticEquationSolver {

    public static void solveQuadraticEquation(double a, double b, double c) {
        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Check the value of the discriminant
        if (discriminant > 0) {
            // Two real solutions
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The solutions are: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            // One real solution
            double root = -b / (2 * a);
            System.out.println("The solution is: " + root);
        } else {
            // No real solutions (complex solutions)
            System.out.println("No real solutions.");
        }
    }

    public static void main(String[] args) {
        // Example usage
        solveQuadraticEquation(1, -3, 2); // The solutions are 2.0 and 1.0
        solveQuadraticEquation(1, 2, 1);  // The solution is -1.0
        solveQuadraticEquation(1, -4, 5); // No real solutions
    }
}

