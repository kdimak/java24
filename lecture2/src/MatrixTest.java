import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    public void createsMatrixFromString() {
        String s = "3 2 1\n" +
                "4 5 6\n" +
                "7 4 7";

        Matrix matrix = Matrix.fromString(s);

//        assertEquals(new int[][]{{3, 2, 1}, {4, 5, 6}, {7, 4, 7}}, matrix.getRawMatrix());
        assertTrue(Arrays.deepEquals(new int[][]{{3, 2, 1}, {4, 5, 6}, {7, 4, 7}}, matrix.getRawMatrix()));
    }

}