package Exercise5;

public class Main {

        public static void main(String[] args) {
            int[][] data1 = {{1, 2}, {3, 4}};
            int[][] data2 = {{5, 6}, {7, 8}};

            Matrix matrix1 = new Matrix(data1);
            Matrix matrix2 = new Matrix(data2);

            System.out.println("Matrix 1:");
            matrix1.displayMatrix();
            System.out.println("\nMatrix 2:");
            matrix2.displayMatrix();

            Matrix addition = Matrix.Operation.add(matrix1, matrix2);
            if (addition != null) {
                System.out.println("\nMatrix Addition:");
                addition.displayMatrix();
            }

            Matrix subtraction = Matrix.Operation.subtract(matrix1, matrix2);
            if (subtraction != null) {
                System.out.println("\nMatrix Subtraction:");
                subtraction.displayMatrix();
            }

            Matrix multiplication = Matrix.Operation.multiply(matrix1, matrix2);
            if (multiplication != null) {
                System.out.println("\nMatrix Multiplication:");
                multiplication.displayMatrix();
            }
        }
    }

