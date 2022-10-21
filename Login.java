import java.io.*;
import java.util.Scanner;

public class Login {
    private String username, password;
    int user_type;

    private UserInfoItem.USER_TYPE UserType = UserInfoItem.USER_TYPE.Buyer;


    public boolean getLogin() {
        boolean login = true;
        Scanner sc = new Scanner(System.in);
        while (login) {
            System.out.println("===== Login =====");
            System.out.println("Enter your Username:");
            username = sc.nextLine();
            System.out.println("Enter your Password:");
            password = sc.nextLine();
            System.out.println("Enter Integer (1 or 2):\n1. Buyer\n2. Seller\n(Enter 0 to exit the login system)\nEnter your choice:");
            user_type = Integer.parseInt(sc.nextLine());
            switch (user_type) {
                case 1:
                    login = false;
                    UserType = UserInfoItem.USER_TYPE.Buyer;
                    break;
                case 2:
                    UserType = UserInfoItem.USER_TYPE.Seller ;
                    login = false;
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Enter a valid choice! (0,1,2)");
                    break;
            }
            if (checkUser(username, password, user_type)) {
                login = false;
                return true;
            }
            else
            {
                System.out.println("Authentication Failed! Incorrect Username/Password");
                login = true;
            }
        }
        return false;
    }

    public boolean checkUser(String uname, String pwd, int role) {
        boolean valid = false;
        FileReader fr = null;
        try {
            if (role == 1) {

                fr = new FileReader("BuyerInfo.txt");
            } else {
                fr = new FileReader("SellerInfo.txt");
            }
            BufferedReader bufferedReader = new BufferedReader(fr);
            String line;
            String k[] = new String[2];
            
            while ((line = bufferedReader.readLine()) != null) {
                k = line.split(":");
                if (k[0].compareTo(uname) == 0 && k[1].compareTo(pwd) == 0) {
                    fr.close();
                    bufferedReader.close();
                    return true;
                }
            }
            fr.close();
            bufferedReader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return valid;
    }

    public UserInfoItem.USER_TYPE getUserType() {
        return UserType;
    }

    public int getUser_type() {
        return user_type;
    }

    public String getUname() {
        return username;
    }
}
