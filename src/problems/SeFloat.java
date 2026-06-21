package problems;

import java.util.*;
public class SeFloat{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float start = sc.nextFloat();
        float end = sc.nextFloat();
        int s = Math.round(start*10);
        int e = Math.round(end*10);
        for(int i= s;i<=e;i+=2){
            System.out.print((i/10.0)+"^2");
            if(i<e){
                System.out.print(", ");
            }else{
                System.out.print(".");
            }
        }
    }
}