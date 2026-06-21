package problems;

import java.util.*;
public class SePattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for(int i = start; i>=end; i--){
            System.out.print(i+"@"+(i-1));
            if(i>end){
                System.out.print(",");
            }
        }
        for(int i=start;i<=end;i++){
            System.out.print(i+"@"+(i+1));
            if(i<end){
                System.out.print(",");
            }
        }
    }
}