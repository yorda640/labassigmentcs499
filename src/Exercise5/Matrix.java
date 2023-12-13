package Exercise5;

class Matrix {
    private final int[][] matrix;

    public Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void displayMatrix() {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    static class Operation {
        public static Matrix add(Matrix m1, Matrix m2) {
            int rows = m1.matrix.length;
            int columns = m1.matrix[0].length;
            int[][] result = new int[rows][columns];

            if (rows != m2.matrix.length || columns != m2.matrix[0].length) {
                System.out.println("Matrix dimensions do not match for addition");
                return null;
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result[i][j] = m1.matrix[i][j] + m2.matrix[i][j];
                }
            }

            return new Matrix(result);
        }

        public static Matrix subtract(Matrix m1, Matrix m2) {
            int rows = m1.matrix.length;
            int columns = m1.matrix[0].length;
            int[][] result = new int[rows][columns];

            if (rows != m2.matrix.length || columns != m2.matrix[0].length) {
                System.out.println("Matrix dimensions do not match for subtraction");
                return null;
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result[i][j] = m1.matrix[i][j] - m2.matrix[i][j];
                }
            }

            return new Matrix(result);
        }

        public static Matrix multiply(Matrix m1, Matrix m2) {
            int rowsM1 = m1.matrix.length;
            int columnsM1 = m1.matrix[0].length;
            int columnsM2 = m2.matrix[0].length;
            int[][] result = new int[rowsM1][columnsM2];

            if (columnsM1 != m2.matrix.length) {
                System.out.println("Matrix dimensions do not allow multiplication");
                return null;
            }

            for (int i = 0; i < rowsM1; i++) {
                for (int j = 0; j < columnsM2; j++) {
                    for (int k = 0; k < columnsM1; k++) {
                        result[i][j] += m1.matrix[i][k] * m2.matrix[k][j];
                    }
                }
            }

            return new Matrix(result);
        }
    }
}