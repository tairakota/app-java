package oop2;

public class ShapeTest {
    public static int getTotalArea(Shape[] sum) {
        var i = sum[0].calculateArea();
        var j = sum[1].calculateArea();
        return i + j;
    }

    public static void main(String[] args) {
        var triangle = new Triangle(2, 4);
        var rectangle = new Rectangle(5, 6);
        Shape[] sha = {triangle, rectangle};
        System.out.println(getTotalArea(sha));
    }
}
