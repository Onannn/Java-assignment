import java.util.Scanner;
public class ff {
public static void main(String[] args) {
    Scanner first = new Scanner(System.in);
    System.out.print("Enter value for principal ");
    float principal = first.nextFloat();

    System.out.print("Enter value for time ");
    float time = first.nextFloat();

    System.out.print("Enter value for rate ");
    float rate = first.nextFloat();

    System.out.print(" number of times interest applied per time period");
    float n = first.nextFloat();

    float var1 = 1 + (rate / n);
    float var2 = n * time ;
    float var3 = (float) Math.pow(var1, var2);
    float compound = principal * var3;

    System.out.print("Compound interest is " +compound);
   

}
}
