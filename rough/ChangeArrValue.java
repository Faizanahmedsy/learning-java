package rough;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeArrValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String name = "Faizan";

        changeValue(arr,name);
        System.out.println(Arrays.toString(arr)); //Changes the original array
        System.out.println(name);;//DOes not change the orignal name
    }

    private static void changeValue(int[] nums, String word) {
        nums[0] = 69;
        word= "Chicku";
    }
}
