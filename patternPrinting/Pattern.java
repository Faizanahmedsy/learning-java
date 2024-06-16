package patternPrinting;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern01(n);
        sc.close();
    }

    public static void pattern01(int n) {
        for (int row = 1; row <= n; row++) { // Changed condition to row <= n
            for (int col = 1; col <= row; col++) { // Changed condition to col <= row
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
