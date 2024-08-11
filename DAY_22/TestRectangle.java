import java.util.*;

class Rectangle {
    int l, b, area;

    public void insertData() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length");
        l = s.nextInt();
        System.out.println("Enter width");
        b = s.nextInt();
    }

    public void printArea() {
        area = l * b;
        System.out.println("Area is: " + area);
    }
}

class TestRectangle {
    public static void main(String args[]) {
        Rectangle r = new Rectangle();
        r.insertData();
        r.printArea();
    }
}

