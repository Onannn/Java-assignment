package Ellis.EXercise;
import java.util.Scanner;
public class fourth {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.print("Enter first number ");
        int num1 = var.nextInt();

        System.out.println("Enter second number ");
        int num2 = var.nextInt();
        int hcf = 0;

        for(int i = 0; i <= num1*num2; i++ ) {
            if(i % num1 == 0 && i % num2 == 0) {
                hcf += i;

            }
        }
        System.out.print(hcf);

    }
    
}
