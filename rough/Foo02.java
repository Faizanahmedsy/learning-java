package rough;

import java.util.Scanner;

public class Foo02 {
    public static void main(String[] args){
        System.out.println("Enter your name");
        System.out.println("Enter Password");


        //Scanner is a public class which means we can access it from anywhere and in params we have specified that we are taking input from the System ie. Keyboard
        Scanner input = new Scanner(System.in);
        // input now is a variable which corresponds to the scanner class which means that input will now have all the functions provided by the scanner class
        System.out.println(input.nextInt());

    }
}
