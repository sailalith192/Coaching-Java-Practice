package problems;

import java.util.*;
public class Se{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start=sc.nextInt();
        int end = sc.nextInt();
        if(start>end){
            for(int i =start;i>=end;i--){
                if(i<0){
                    System.out.print("5*("+i+")");
                }else{
                    System.out.print("5*"+i);
                }
                if(i!=end){
                    System.out.print(", ");
                }
            }
        }
        else{
            for(int i = start;i<=end;i++){
                if(i<0){
                    System.out.print("5*("+i+")");
                }else{
                    System.out.print("5*"+i);
                }
                if(i!=end){
                    System.out.print(", ");
                }
            }
        }
    }
}