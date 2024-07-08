public class Bottle extends Product{
    public Bottle(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculate() {
        return price;
    }
}
