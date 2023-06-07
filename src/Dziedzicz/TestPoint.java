package Dziedzicz;

public class TestPoint {
    public static void main(String[] args) {
        Point p =new Point(3,4);
        p.setY(45);
        System.out.println(p);
        MovablePoint mp = new MovablePoint(1,2,3,4);
        System.out.println(mp.move().move().move());
        Point mp2 = mp;
    }
}
