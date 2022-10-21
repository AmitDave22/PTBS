import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class BuyerTradingMenu extends TradingMenu { //Bridge Design Pattern
    private boolean boolSubmit = false;
    private String tradingName, offering, suggestedOffering, view;

    public void ShowMenu(Trading trading, Person person) {
        int i = 0;
        ProductIterator iterator = new ProductIterator(new ClassProductList());
        Product product = (Product) iterator.next();
        Set categories = new HashSet();
        while (product != null) {
            categories.add(product.toStringPCat());
            product = (Product) iterator.next();
        }
        System.out.println("There are " + categories.size() + " categories available to buy from:");
        Iterator itr = categories.iterator();
        while (itr.hasNext()) {
            System.out.println((i + 1) + ". " + itr.next());
            i++;
        }
        System.out.println("Enter your choice[1-" + categories.size() + "]:");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch (choice){
            case 1:
                ProduceProductMenu pmenu = new ProduceProductMenu();
                pmenu.showMenu();
                break;
            case 2:
                MeatProductMenu mmenu = new MeatProductMenu();
                mmenu.showMenu();
                break;
        }

    }
}
