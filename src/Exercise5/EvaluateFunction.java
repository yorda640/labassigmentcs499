package Exercise5;

public class EvaluateFunction {
    public double evaluate(MathFunction function, double x) {
        return function.evaluate(x);
    }

    public static void main(String[] args) {
        EvaluateFunction evaluator = new EvaluateFunction();

        // Anonymous inner class representing a square function
        MathFunction squareFunction = new MathFunction() {
            @Override
            public double evaluate(double x) {
                return x * x;
            }
        };

        // Create an anonymous inner class representing a cube function
        MathFunction cubeFunction = new MathFunction() {
            @Override
            public double evaluate(double x) {
                return x * x * x;
            }
        };

        // Create an anonymous inner class representing a sine function
        MathFunction sineFunction = new MathFunction() {
            @Override
            public double evaluate(double x) {
                return Math.sin(x);
            }
        };

        // Evaluate and display results
        double x = 2.5;
        System.out.println("Square of " + x + ": " + evaluator.evaluate(squareFunction, x));
        System.out.println("Cube of " + x + ": " + evaluator.evaluate(cubeFunction, x));
        System.out.println("Sine of " + x + ": " + evaluator.evaluate(sineFunction, x));
    }

}
