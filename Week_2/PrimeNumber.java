package week2.week_2.src;

import java.util.Scanner;

public class PrimeNumber {
     public boolean prime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
            if(n <= 1) 
                return false;

            for(int i = 2 ; i*i <= n ; i++ ){
                if(n % i == 0 ) return false ; 
            }
            return true;
        }
    }
