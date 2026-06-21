package bucket1;
import java.util.*;
public class HabitProfile {
    String habitName;
    int targetMinutes;
    HabitProfile(String habitName , int targetMinutes){
        this.habitName = habitName;
        this.targetMinutes = targetMinutes;

    }
    public void showProfile(){
        System.out.println("PRAENOS Target:  " + habitName + " for "+ targetMinutes+ " minutes daily.");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the habit you want to track: ");
        String userHabit = sc.nextLine();
        System.out.print("Enter daily target (In minutes): ");
        int userTime = sc.nextInt();
        HabitProfile myHabit = new HabitProfile(userHabit , userTime);
        myHabit.showProfile();
        sc.close();
    }

}
