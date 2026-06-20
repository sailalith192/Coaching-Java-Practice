package bucket1;

import java.util.*;
public class AuthService {
    public void verifyToken(String token){
        System.out.println("Token verified: " + token);
    }
    public static void loginUser(String username , String token){
        System.out.println("Logging in user: " + username);
        AuthService obj = new AuthService();
        obj.verifyToken(token);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String name = sc.nextLine();
        System.out.println("Enter user token: ");
        String secToken = sc.nextLine();
        loginUser(name , secToken);
        sc.close();
    }
}
