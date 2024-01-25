package multiArrays;

public class MultiArrays {

    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        int[] simpleArray = new int[5];

        int[][] twoArrays = {
                {5,6,8},
                {5,2,1},
                {3,3,6}
        };
        System.out.println(twoArrays[2][1]);
        int[][] arrays = new int[3][5];

        int[][] uglyTwoArrays = {{5,6,8},{5,2,1},{3,3,6} };
        int[][][] godForsakenAbomination = {
                {{3,1}, {9,5}},
                {{5,1},{2,5}}
        };
    }
}
