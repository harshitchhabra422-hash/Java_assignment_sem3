package WEEK_2;
import java.util.Scanner ;
public class GradingSystem {
    public void marks(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter marks : ");
    int Marks = sc.nextInt();
    if(Marks>=80 && Marks<=100 ){
    System.out.println("Distenction");
    }
    else if(Marks>=70 && Marks<=79 ){
        System.out.println("Merit");
    }
    else if(Marks>=50 && Marks<=69 ){
        System.out.println("Pass");
    }
    else if(Marks>= 0 && Marks<= 49){
        System.out.println("Fail");
    }
    else {
        System.out.println("INvalid marks");
    }
    }
}

