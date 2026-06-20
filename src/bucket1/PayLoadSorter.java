package bucket1;

import java.util.*;
public class PayLoadSorter {
    public void processLog(float latency , String serverName){
        System.out.println("ProcessLogs latency: "+ latency + " | ProcessLog serverName: "+serverName);
    }
    public static void checkStatus(boolean isActive , long uptime){
        System.out.println("check status of isActive: "+isActive + " | and uptime: "+uptime);
    }
    public void flagError(char errorCode , int priorityLevel){
        System.out.println("errorCode: "+errorCode+ " | priorityLevel: "+priorityLevel);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter latency: " );
        float latency = sc.nextFloat();
        System.out.print("enter serverName: ");
        String serverName = sc.next();
        System.out.print("Enter isActive: ");
        boolean isActive = sc.nextBoolean();
        System.out.print("uptime: ");
        long upTime = sc.nextLong();
        System.out.print("enter errorCode: ");
        char errorCode = sc.next().charAt(0);
        System.out.print("enter prirority: ");
        int priorityLevel = sc.nextInt();
        PayLoadSorter load = new PayLoadSorter();
        load.processLog(latency , serverName);
        checkStatus(isActive, upTime);
        load.flagError(errorCode , priorityLevel);
        sc.close();
    }
}
