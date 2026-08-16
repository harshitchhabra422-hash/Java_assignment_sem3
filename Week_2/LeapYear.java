package week2.week_2.src;
import java.util.Scanner;
public class LeapYear {
     public void IsLeapYear(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter marks : ");
    int year = sc.nextInt();
    if((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)){
        System.out.println("It is a leap year");
    }
    else{
        System.out.println("It is not a leap year");
    }
    }
}
