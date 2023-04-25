package oop2;

public class Rectangle implements Shape {
    int vertical;
    int beside;

    public Rectangle(int vertical, int beside) {
        this.vertical = vertical;
        this.beside = beside;
    }

    public int calculateArea() {
        return vertical * beside;
    }
}
