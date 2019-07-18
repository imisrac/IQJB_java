package fuits;

public abstract class Fruit implements Cloneable {

    String type;

    public String getType() {
        return type;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
