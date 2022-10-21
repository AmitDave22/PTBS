class UserInfoItem {

    UserInfoItem(){
        UserType = USER_TYPE.Buyer;
    }
    public enum USER_TYPE { Buyer, Seller }

    String strUserName;
    USER_TYPE UserType; // 0 : Buyer, 1: Seller

    public void setUserType(int user) {
        if(user == 1)
            UserType = USER_TYPE.Buyer;
        else
            UserType = USER_TYPE.Seller;
    }
}