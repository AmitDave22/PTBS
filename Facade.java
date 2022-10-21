import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ClassProductList extends ArrayList<Product> { // Facade Design Pattern as in the Class Diagram

    ClassProductList() {
        InitializeFromFile();
    }

    void InitializeFromFile() {
        try {
            String data[];
            System.out.println("Successfully initialized the file. ");
            BufferedReader file;
            String productName, productCategory, line;
            int i = 0;
            file = new BufferedReader(new FileReader("ProductInfo.txt"));
            while ((line = file.readLine()) != null) {
                data = line.split(":");
                productCategory = data[0];
                productName = data[1];
                Product theProduct = new Product(productCategory, productName);
                theProduct.setId(i);
                i++;
                add(theProduct);
            }
        } catch (Exception ignored) {
        }
    }

    public void accept(NodeVisitor visitor) {
        visitor.visitClassProductList(this);
    }

}
