import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final int ROWS = 3;
    public static final int COLUMNS = 5;

    static class OurFirstClass {
        private int x;
        private int y;
        private String s;

        public OurFirstClass(int x) {
            this.x = x;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

//    record OurFirstClass(int x, int y) {
//    }

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        List<Integer> numbersList = new ArrayList<>();
        numbersList.add(1);
        numbersList.add(2);
//        numbers.add("444");

//        int[] numbers = new int[3];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;

        Integer[] numbers = new Integer[]{1, 2, 3, 4};

/*
        for (int i = 0; i < numbers.length; i++) {
//            System.out.println("numbers[" + i + "] = " + numbers[i]);
            System.out.println("numbers: " + numbers[i]);
        }
*/

        for (int number : numbers) {
//            System.out.println("numbers[" + i + "] = " + numbers[i]);
            System.out.println("numbers: " + number);
        }

        int n = 5;

        int[][] matrix = new int[ROWS][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("matrix: " + matrix[i][j]);
            }
        }

        int a = Integer.MAX_VALUE;
        short b = 1;

        short c = (short) (a / b);
        System.out.println("a = " + a);
        System.out.println("c = " + c);

        System.out.println("5/2 = " + 5.6 / 2);

        for (int i = 1; i <= 5; i++) {
            int j = 0;
//            j = i + 1;

            OurFirstClass first = null;
//            first = new OurFirstClass(i);

            System.out.println("first.getX() = " + first.getX());
            System.out.println("first.getY() = " + first.getY());
//            System.out.println("i = " + i);
        }
    }
}