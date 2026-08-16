package week2.week_2.src;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public void marks(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number : ");
    int first = sc.nextInt();
    int second = sc.nextInt();
    int remainder ;
    for (; second != 0; ) {
     remainder = first % second;
    first = second;
    second = remainder;}
    System.out.println("The greatest common divisor is : "+first);
}
}
