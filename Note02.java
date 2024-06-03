import java.util.Arrays;

public class Note02 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.println(numbers); // this will NOT print the array 
        System.out.println(Arrays.toString(numbers)); // this will print the array, by default the int array has number 0

        int[] num2 = {1,2,3,4};
        System.out.println(Arrays.toString(num2));
    }
    
}
