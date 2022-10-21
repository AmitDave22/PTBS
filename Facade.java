public class Facade {

    private Login login = new Login();

    private int UserType;

    private Product theSelectedProduct;

    private int nProductCategory;

    private ClassProductList theProductList;

    private Person thePerson;

    public boolean login(UserInfoItem userInfoItem) {
        if(login.getLogin())
        {
            userInfoItem.UserType = login.getUserType();
            userInfoItem.strUserName = login.getUname();
            return true;
        }
        else {
            return false;
        }

    }

    public void addTrading(Product product) {
        Trading trading;


    }

    public void viewTrading() {

    }

    public void decideBidding() {

    }

    public void discussBidding() {

    }

    public void remind() {

    }

    public void createUser(UserInfoItem userinfoitem) {

    }

    public void createProductList() {

    }

    public void AttachProductToUser() {

    }

    public void SelectProduct() {

    }

    public void productOperation() {

    }

}
