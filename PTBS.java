public class PTBS {
    static Facade facade = new Facade();
    static Login login = new Login();
    static UserInfoItem userInfoItem = new UserInfoItem();
    public static void main(String[] args) {
        if(facade.login(userInfoItem))
        {
            System.out.println("Login Successful " + userInfoItem.UserType);
            facade.productOperation(userInfoItem);
        }

    }
}
