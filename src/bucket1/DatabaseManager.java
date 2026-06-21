package bucket1;
import java.util.*;
public class DatabaseManager {
    DatabaseManager(String environmentName){
        System.out.println("SYSTEM ALARAM: Connecting to " + environmentName + " Database.");
    }
    public static void main(String[] args){
        DatabaseManager devNode =new DatabaseManager("deveolpment");
        DatabaseManager PordNode = new DatabaseManager("Product");
    }
}
