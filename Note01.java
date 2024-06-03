import java.awt.*;

class Note01 {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = p1;
        p2.x = 7; // p1 and p2 refrence the same points so changing p2 will also change p1
        System.out.println(p1);
        System.out.println(p2);

    }
}