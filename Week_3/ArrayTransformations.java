package Week3.week_3.src;

import java.util.Scanner;

public class ArrayTransformations {
    public class Array 
 {
    public void marks()
  { Scanner sc = new Scanner(System.in);
    System.out.println("Number of elements : ");
    int n = sc.nextInt();
    int [] values = new int[n];
    for(int i = 0 ; i < n ; i++){
        System.out.print("Enter value "+i);
        values[i] = sc.nextInt();}
  }
 }
 static void reverseInPlace(int[] values) {
    int left = 0;
    int right = values.length - 1;

    while (left < right) {
        int temp = values[left];
        values[left] = values[right];
        values[right] = temp;

        left++;
        right--;
    }
}

static int[] reversedCopy(int[] values) {
    int[] result = new int[values.length];

    for (int i = 0; i < values.length; i++) {
        result[i] = values[values.length - 1 - i];
    }

    return result;
}

static int removeValue(int[] values, int target) {
    int write = 0;

    for (int i = 0; i < values.length; i++) {
        if (values[i] != target) {
            values[write] = values[i];
            write++;
        }
    }

    return write;
}

static int[] runningSum(int[] values) {
    int[] result = new int[values.length];
    int sum = 0;

    for (int i = 0; i < values.length; i++) {
        sum += values[i];
        result[i] = sum;
    }

    return result;
}
}
