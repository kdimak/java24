public class Matrix {

    private int[][] matrix;

    public Matrix(int rows, int columns) {
        matrix = new int[rows][columns];
    }

    private Matrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public static Matrix fromString(String s) {
        String[] rows = s.split("\n");
        int[][] matrix = new int[rows.length][];

        for (int i = 0; i < rows.length; i++) {
            String[] elements = rows[i].split(" ");
            matrix[i] = new int[elements.length];

            for (int j = 0; j < elements.length; j++) {
                matrix[i][j] = Integer.parseInt(elements[j]);
            }
        }

        return new Matrix(matrix);
    }

    /*
    3 2 1      1 2 3
    4 5 6   -> 4 5 6
    7 4 7      4 7 7
     */
    public void sortRows() {
        for (int i = 0; i < matrix.length; i++) {
            int[] row = matrix[i];
            for (int j = 0; j < row.length / 2; j++) {
                int temp = row[j];
                row[j] = row[row.length - 1 - j];
                row[row.length - 1 - j] = temp;
            }
        }
    }

    public int getRows() {
        return matrix.length;
    }

    public int getColumns() {
        return matrix[0].length;
    }

    public int getElement(int i, int j) {
        return matrix[i][j];
    }

    public int[][] getRawMatrix() {
        return matrix;
    }

}
