import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ProduceProductMenu implements ProductMenu { // Factory design pattern to display the product menu class

    public void showMenu() {
        int i = 0;
        ProductIterator iterator = new ProductIterator(new ClassProductList());
        Product product = (Product) iterator.next();
        Set produce = new HashSet();
        while (product != null) {
            if (product.toStringPCat().equalsIgnoreCase("produce"))
            {
                produce.add(product.toStringPName());
            }
            product = (Product) iterator.next();
        }
        System.out.println("There are " + produce.size() + " Produce Products available:");
        Iterator itr = produce.iterator();
        while (itr.hasNext()) {
            System.out.println((i + 1) + ". " + itr.next());
            i++;
        }
        System.out.println("Enter your choice[1-" + produce.size() + "]:");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch (choice){
            case 1:
                System.out.println("Onion Selected");
                break;
            case 2:
                System.out.println("Tomato Selected");
                break;
        }

    }

    public void showAddButton() {

    }

    public void showViewButton() {

    }

    public void showRadioButton() {

    }

    public void showLabels() {

    }

    public void showComboxes() {

    }

}
