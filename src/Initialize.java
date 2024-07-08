import java.util.Arrays;
import java.util.Collections;

public class Initialize {
    public static void main(String[] args) {
       Box box = new Box(
               Arrays.asList(
                       new Box(
                               Collections.emptyList(),
                               Arrays.asList(
                                       new Product("Book", 250),
                                       new Product("Toffe", 450),
                                       new Product("Ruler", 500)
                               )
                       ),
                       new Box(
                               Collections.emptyList(),
                               Arrays.asList(
                                       new Product("Phone", 250),
                                       new Product("Shirt", 450),
                                       new Product("Bag", 500)
                               )
                       ),
                       new Box(Collections.emptyList(),
                               Collections.emptyList())
               ),
               Arrays.asList(
                       new Product("Mouse", 250),
                       new Product("Bottle", 450))
       );

        double cost = box.calculateCost();
        System.out.println("Total : "+cost);
    }
}
