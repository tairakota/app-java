package oop2;

public class Triangle implements Shape {
    int bottom;
    int height;

    public void Triangle(int bottom, int height) {
        this.bottom = bottom;
        this.height = height;
    }

    @Override
    public int calculateArea() {
        return bottom * height / 2;
    }
}
