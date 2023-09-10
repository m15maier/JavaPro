package ShipBattle;

public class Arrays {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[5] = 999;
        array[3] = 234;
        array[0] = 908;

        int[][] secondArray = new int [3][10];
        int[][] thirdArray = new int[10][3];

        secondArray [1][2] = 5;
        thirdArray [1][2] = 5;

        secondArray [1][5] +=10;

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];


        a[0][0] += b [0][0];
        a[0][1] += b [0][1];
        a[1][0] += b [1][0];
        a[1][1] += b [1][1];


        System.out.println(java.util.Arrays.toString(array));
        System.out.println(java.util.Arrays.deepToString(secondArray));
        System.out.println(java.util.Arrays.deepToString(thirdArray));

        System.out.println("Hello world!");

    }

}
