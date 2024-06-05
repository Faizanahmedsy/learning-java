package rough;

import java.util.Arrays;
// How to print different datatypes
public class Foo01 {
    public static void main(String[] args){
        String name = "Faizan";
        int age = 89;
        float height = 5.9f;
        double weight = 70.5;
        String[] skills = {"Next js", "Typescript"};

        System.out.println(9090);
        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d\n", age);
        System.out.printf("Height: %.1f\n", height); // %.1f for one decimal place
        System.out.printf("Weight: %.1f\n", weight);
        System.out.println(Arrays.toString(skills));

    }
    
}
