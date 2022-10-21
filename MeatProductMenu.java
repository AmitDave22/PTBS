import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class MeatProductMenu implements ProductMenu { // Factory Design Pattern Utilized

    public void showMenu() {
        int i = 0;
        ProductIterator iterator = new ProductIterator(new ClassProductList());
        Product product = (Product) iterator.next();
        Set meat = new HashSet();
        while (product != null) {
            if (product.toStringPCat().equalsIgnoreCase("meat"))
            {
                meat.add(product.toStringPName());
            }
            product = (Product) iterator.next();
        }
        System.out.println("There are " + meat.size() + " Meat Products available:");
        Iterator itr = meat.iterator();
        while (itr.hasNext()) {
            System.out.println((i + 1) + ". " + itr.next());
            i++;
        }
        System.out.println("Enter your choice[1-" + meat.size() + "]:");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch (choice){
            case 1:
                System.out.println("Selected Option : Beef");
                break;
            case 2:
                System.out.println("Selected Option : Mutton");
                break;
            case 3:
                System.out.println("Selected Option : Pork");
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
