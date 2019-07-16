public abstract class Extra implements Product {
    Product product;

    public Extra(Product product) {
        this.product = product;
    }

    public double price() {
        return product.price();
    }
}
