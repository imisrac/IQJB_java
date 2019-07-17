package objectadapter;

public class MyTriangle {

    private int a;
    private int b;
    private int c;

    public MyTriangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double a() {
        double halfPerimeter = p() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    public double p() {
        return a + b + c;
    }
}
