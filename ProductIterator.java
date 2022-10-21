import java.util.Iterator;

public class ProductIterator implements Iterator { //Iterator Design Pattern

    private ClassProductList classProductList;
    private int currentProductNumber = -1;

    ProductIterator(ClassProductList productList)
    {
        classProductList = productList;
    }
    public boolean hasNext() {
        return currentProductNumber < classProductList.size() - 1;
    }

    public Product next() {
        if(hasNext())
        {
            currentProductNumber++;
            return  classProductList.get(currentProductNumber);
        }
        else {
            return null;
        }
    }
    public Product next(String pname)
    {
        Product product = next();
        while(product != null){

            if(product.toString().compareToIgnoreCase(pname) == 0)
            {
                return product;
            }
            product = next();
        }
        return null;
    }
    public void MoveToHead() {
        currentProductNumber = -1;
    }

    public void remove() {
        classProductList.remove(currentProductNumber);

    }

}
