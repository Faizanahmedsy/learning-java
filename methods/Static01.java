package methods;

public class Static01 {
    public static void main(String[] args) {

        // A static method (like main) cannot directly call a non-static method unless
        // it has an instance of the class.

        // To fix this, you have two options:

        // Make the sum method static.
        // Create an instance of the class and call the non-static method using that
        // instance.

        // sum(1,2) //ERROR Cannot make a static reference to the non-static method
        // sum(int, int) from the type Static01Java(603979977)

        product(1, 2);
    }

    void sum(int a, int b) {
        System.out.println(a + b);
        ;
    }

    static void product(int a, int b) {
        System.out.println(a * b);
    }

}