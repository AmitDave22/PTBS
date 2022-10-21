public abstract class Person {

    int type = 0;
    String UserName;
    ClassProductList classProductList;
    ProductMenu productMenu;
    Product currentProduct;

    Person() {
        classProductList = new ClassProductList();
    }

    private ProductMenu theProductMenu;

    public void showMenu() {

    }

    public void showAddButton() {

    }

    public void showViewButton() {

    }

    public void showRadioButton() {

    }

    public void showLabels() {

    }

    public ProductMenu CreateProductMenu() {
        return null;
    }

    public void addProduct(Product theSelectedProduct) {
    }
}
