package classadapter;

public abstract class MyTriangle {

    private int a;
    private int b;
    private int c;

    public MyTriangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    protected double a() {
        double halfPerimeter = p() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    protected double p() {
        return a + b + c;
    }
}
