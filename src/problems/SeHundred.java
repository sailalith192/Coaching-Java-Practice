package problems;

import java.util.*;
public class SeHundred{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        if(start<=0||end<=0){
            System.out.print("Invalid Inputs");
        }
        for(int i =start;i<=end;i+=100){
            System.out.print(i);
            if(i<end){
                System.out.print(", ");
            }
        }
    }
}