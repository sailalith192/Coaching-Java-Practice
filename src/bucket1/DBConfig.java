package bucket1;

import java.util.*;
public class DBConfig {
    public void setDBName(String dbName){
        System.out.println("Connecting to database: " + dbName);
    }
    public static void setPort(int port){
        System.out.println("Secure port mapped to: "+ port);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Db Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Port number: ");
        int portNumber = sc.nextInt();
        setPort(portNumber);
        DBConfig obj = new DBConfig();
        obj.setDBName(name);
        sc.close();

    }

}
