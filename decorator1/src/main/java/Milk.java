public class Milk extends Extra {

    public Milk(Product product) {
        super(product);
    }

    public double price() {
        return super.price() + 100;
    }
}
