import java.util.Scanner ;
public class TemperatureConversion {
     public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the temperature in celsius : ");
          int celsius = sc.nextInt();
        double  fahrenheit = (celsius * 9.0) / 5.0 + 32.0;
        System.out.println("The value in fahrenheit after conversion : "+fahrenheit);

     }
}
