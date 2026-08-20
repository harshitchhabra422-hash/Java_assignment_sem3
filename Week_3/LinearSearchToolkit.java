package Week3.week_3.src;

import java.util.Scanner;

public class LinearSearchToolkit 
{
    public class Array 
 {
    public void marks()
  { Scanner sc = new Scanner(System.in);
    System.out.println("Number of elements : ");
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int i = 0 ; i < n ; i++){
        System.out.print("Enter value "+i);
        arr[i] = sc.nextInt();}
  }
 }
 static boolean contains(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return true;
        }
    }
    return false;
}
 static int firstIndexOf(int[] arr, int target){
    int j = 0 ;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
             j = i ;
        }
    }
    return j ;
 }
 static int lastIndexOf(int[] arr, int target){
     int j = 0 ;
    for (int i = arr.length - 1 ; i >= 0; i--) {
        if (arr[i] == target) {
             j = i ;
        }
    }
    return j ;
 }
 static int countOccurrences(int[] arr , int target){
    int j = 0 ;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
             j += i ;
        }
    }
    return j ;
 }
}
