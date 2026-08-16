package week2.week_2.src;

import java.util.Scanner;

public class NumberReversal {
     public void Number(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number : ");
    int number = sc.nextInt();
    int reversed = 0;

while (number != 0) {
    int digit = number % 10;
    reversed = reversed * 10 + digit;
    number = number / 10;
        }

    }
}
