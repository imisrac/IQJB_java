package classadapter;

import base.Shape;

public class Triangle extends MyTriangle implements Shape {

    public Triangle(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public double area() {
        return this.a();
    }

    @Override
    public double perimeter() {
        return this.p();
    }
}
