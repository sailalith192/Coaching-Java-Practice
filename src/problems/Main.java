package problems;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i<=n; i+=2){
            if(i%5==0){
                System.out.print("divisible by five");
            }else{
                System.out.print(i);
            }
            if(i+2 <=n){
                System.out.print(", ");
            }
        }
        sc.close();
    }
}