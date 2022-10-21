public class PTBS{
    static Facade facade_obj = new Facade();
    static UserInfoItem user_obj = new UserInfoItem();
    public static void main(String[] args) {
        
        if(facade_obj.login(user_obj))
        {
            System.out.println("Successfully logged in as a "+user_obj.UserType+"!");
        }

    }
}
