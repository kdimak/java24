import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    public void createsMatrixFromString() {
        String m = "3 2 1\n" +
            "4 5 6\n" +
            "7 4 7";

//        Matrix matrix = Matrix.fromString(s);
//        Matrix matrix = Matrix.fromFile(f);
//        Matrix matrix = Matrix.fromConsole();
        Matrix matrix = new Matrix(m);

//        assertEquals(new int[][]{{3, 2, 1}, {4, 5, 6}, {7, 4, 7}}, matrix.getRawMatrix());
        assertTrue(
            Arrays.deepEquals(new int[][]{{3, 2, 1}, {4, 5, 6}, {7, 4, 7}}, matrix.getRawMatrix()));
    }

    @Test
    public void changesMatrixElement() {
        Matrix matrix = Matrix.fromString("3 2 1\n" +
            "4 5 6\n" +
            "7 4 7");

//        matrix.setElement(0, 1, 77);
        changeMatrixElement(matrix, 0, 1, 77);

        assertEquals(77, matrix.getElement(0, 1));
        assertEquals(77, matrix.getRawMatrix()[0][1]);
    }

    private void changeMatrixElement(Matrix m, int i, int j, int val) {
        m.setElement(i, j, val);
    }

    @Test
    public void camelCaseWorks() {
        String originalString = "camel    cASe    string";
        String camelCased = camelCase(originalString);

        assertEquals("camelCaseString", camelCased);
    }

    @Test
    public void toUpperCaseWorks() {
        String s = "low case";
        String newS = upperTheString(s);
        assertEquals("LOW CASE", newS);
    }

    // "camel    cASe    string" -> "camelCaseString"
    public String upperTheString(String s) {
        return s.toUpperCase();
    }

    public String camelCase(String s) {
        if (s.isBlank()) {
            return "";
        }

        String[] parts = s.split("\\s+");

        if (parts.length == 1) {
            return parts[0];
        }

        int totalLength = 0;
        for (String p : parts) {
            totalLength += p.length();
        }

//        String result = parts[0];
        StringBuilder result = new StringBuilder(totalLength);
        result.append(parts[0]);
        for (int i = 1; i < parts.length; i++) {
            if (parts[i].length() == 1) {
//                result += parts[i].toUpperCase();
                result.append(parts[i].toUpperCase());
            } else {
//                result += parts[i].substring(0, 1).toUpperCase() + parts[i].substring(1).toLowerCase();

//                result.append(parts[i].substring(0, 1).toUpperCase());
//                result.append(parts[i].substring(1).toLowerCase());

                result
                    .append(parts[i].substring(0, 1).toUpperCase())
                    .append(parts[i].substring(1).toLowerCase());
            }
        }

        return result.toString();
    }

}
