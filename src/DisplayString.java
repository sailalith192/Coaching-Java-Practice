import java.util.*;
public class DisplayString {
    public void display(String a){
        System.out.println("The message as to be printed: " + a);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        DisplayString obj = new DisplayString();
        System.out.println("Enter user Message: ");
        String userMessage = sc.nextLine();
        obj.display(userMessage);
        sc.close();
    }
}
