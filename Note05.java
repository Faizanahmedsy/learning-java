public class Note05 {
    public static void main(String[] args) {
        //implicit casting (auto convertion)
        // byte > short > int > long
        short num = 1; // short has 2 bytes
        int sum = num + 7; // 4 bytes
        System.out.println(sum);

        double x = 1.1;
        double y  = x + 2; // int 2 will be auto converted into double 2.0
        System.out.println(y);



        //Explicit Casting
        double a =  1.1;
        // int b = a + 4;// throws exception because double cant auto convert to init

        // explicitly converting double a 1.1 into init a 1
        int b = (int)a + 4;
        System.out.println(b);
    }
}
