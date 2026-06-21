package bucket1;

public class CallingMethod {
    public void display(){
        System.out.println("Method has Succesfully invoked under problems.Main method!!!");
    }
    public static void main(String[] args){
        CallingMethod obj = new CallingMethod();
        obj.display();
    }
}
