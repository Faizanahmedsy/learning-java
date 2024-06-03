import java.util.Arrays;

public class Note03 {
    public static void main(String[] args) {
        int[][] twoDArr = new int[2][3];
        int[][][] threeDArr = new int[2][3][7];


        // deepToString should be used if you want to print it
        System.out.println(Arrays.deepToString(twoDArr));
        System.out.println(Arrays.deepToString(threeDArr));


        int[][] newTwoDarr = {{1,2,3},{4,5,6}};

        System.out.println(Arrays.deepToString(newTwoDarr));


    }
}
