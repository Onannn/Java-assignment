package Ellis.EXercise;
import java.util.Scanner;
public class Seven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number ");
        int num1 = input.nextInt();

        System.out.print("Enter second number ");
        int num2 = input.nextInt();

        for(int i = 1; i < num1*num2; i++) {
            if(i % num1 == 0 && i % num2 == 0) {
                System.out.print(i);
                break;
            }

        }

    }
    
}
