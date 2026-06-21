package problems;

import java.util.*;
public class Series{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        if(start<=0 || end<=0){
            System.out.print("Invalid Inputs");
        }else{
            for(int i=start; i<=end;i+=2){
                System.out.print(i + "^2");
                if(i+2<=end){
                    System.out.print(", ");
                }
            }
        }
    }
}