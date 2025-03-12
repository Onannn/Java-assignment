package Ellis.EXercise;
import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number for multiplication table");
        int num = input.nextInt();  //Got input

        for(int i = 0; i <= 20; i++) {   //Condition to print up to 20
            int multi = num * i;  //Multiplying number
            System.out.println(num + "*" + i + " = " +multi);  //Showing result
        }

    }
    

}
