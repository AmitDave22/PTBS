import java.util.ArrayList;

public class Product {
    private int tradCount;
    private int Id;
    private String productName;
    private String productCategory;
    ArrayList<Trading> tradingList = new ArrayList<>();

    public Product(String pcategory, String pname)
    {
        this.Id = 0;
        this.productName = pname;
        this.productCategory = pcategory;
        this.tradCount = 0;
    }

    void addTrading(Trading newTrade)
    {
        tradingList.add(newTrade);
    }
    public String toStringPName()
    {
        return productName;
    }
    public String toStringPCat()
    {
        return productCategory;
    }
    void accept(NodeVisitor visitor)
    {
        visitor.visitProduct(this);
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getId() {
        return Id;
    }
}
