package problems;

import java.util.*;
public class Sere{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        if(start>end){
            for (int i =start; i>=end;i--){
                int val = i*5;
                if(val<0){
                    System.out.print("("+val+")");
                }else{
                    System.out.print(val);
                }
                if(i!=end){
                    System.out.print(", ");
                }
            }
        }else{
            for(int i = start;i<=end;i++){
                int val = i*5;
                if(val<0){
                    System.out.print("("+val+")");
                }else{
                    System.out.print(val);
                }
                if(i!=end){
                    System.out.print(", ");
                }
            }
        }
    }
}