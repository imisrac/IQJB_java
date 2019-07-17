package objectadapter;

import base.Shape;

public class Triangle implements Shape {

    private MyTriangle myTriangle;
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        myTriangle = new MyTriangle(a, b, c);
    }

    @Override
    public double area() {
        return myTriangle.a();
    }

    @Override
    public double perimeter() {
        return myTriangle.p();
    }
}
