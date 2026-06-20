package bucket1;

import java.util.*;
public class CalSum {
    public int calculateSum(int firstNumber , int secondNumber){
        return firstNumber + secondNumber;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        CalSum obj = new CalSum();
        System.out.println("Enter first number a: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number b: ");
        int secondNumber = sc.nextInt();
        System.out.println("Total calculation of both numbers: " + obj.calculateSum(firstNumber , secondNumber));
    }
}
