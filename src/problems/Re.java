package problems;

import java.util.*;
public class Re{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.print("Invalid Input");
        }else{

            for(int i = 1; i<=n; i++){

                if(i%2!=0){
                    System.out.print("5");
                }else{
                    System.out.print("10");
                }
                if(i <n){
                    System.out.print(", ");
                }

            }


        }
    }
}