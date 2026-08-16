package week2.week_2.src;

import java.util.Scanner;

public class LoopPatterns {
    public void Patterns(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter marks : ");
    int n = sc.nextInt();
    //First case
    for(int i = 0 ; i < 4 ; i++ ){
        for(int j = 0 ; j < 4 ; j++){
            System.out.print("*");
        }
    }
    //Second case 
    for(int i = 0 ; i < 4 ; i++ ){
        for(int j = 0 ; j <= i ; j++){
            System.out.print("*");
        }
    }
    //Third case
    for(int i = 0 ; i < 4 ; i++ ){
        for(int j = 0 ; j <= i ; j++){
            System.out.print(j + "");
        }
    //Fourth case
    for (int i = 4; i >= 1; i--) {
    for (int j = 0; j < i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
    //fifth case
    for(int i = 0 ; i < 4 ; i++ ){
        for(int j = 0 ; j <= i ; j++){
            System.out.print(i + "");
        }
    }
    }
}
}
