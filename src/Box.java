import java.util.List;

public class Box {
    private List<Box> boxes;
    private List<Product> products;
    public Box(List<Box> box, List<Product> products) {
        this.boxes = box;
        this.products = products;
    }

    public double calculateCost() {
        double sum = products.stream()
                .mapToDouble(
                        Product::getCost
                )
                .sum();
        for (Box b : boxes){
            sum += b.calculateCost();
        }
        return sum;
    }
}
