package problems;

import java.util.*;
public class SeFactor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%3==0){
                System.out.print("factor of three");
            }else{
                System.out.print(i);
            }
            if(i<n){
                System.out.print(", ");
            }
        }
    }
}