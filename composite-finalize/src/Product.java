public abstract class Product implements Box {
    protected String title;
    protected double price;

    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }
}
