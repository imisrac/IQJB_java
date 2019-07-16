public class Honey extends Extra {

    private Product product;

    public Honey(Product product) {
        super(product);
    }

    public double price() {
        return super.price() + 80;
    }
}
