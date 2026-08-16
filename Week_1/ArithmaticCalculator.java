import java.util.Scanner ;
public class ArithmaticCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer a : ");
        int a = sc.nextInt();
        System.out.println("Enter integer b : ");
        int b = sc.nextInt();
        int sum = a + b ;
        int difference = a - b ;
        int multiply = a * b ;
        int divide = a/b ;
        int modulus = a % b ;
        System.out.println("The sum is : "+sum);
        System.out.println("The difference is : "+difference);
        System.out.println("The multiplication is : "+multiply);
        System.out.println("The division is : "+divide);
        System.out.println("The remainder is : "+modulus);

    }
}

