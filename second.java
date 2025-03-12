package Ellis.EXercise;
import java.util.Scanner;
public class second {
    public static void main(String[] args) {
        //Without median
        int sum = 0;
        Scanner input = new Scanner(System.in);

        for(int i = 1; i < 21; i++) {
            System.out.println("Enter " +i +" number");
            int num =input.nextInt();
            sum += num;
        }
        System.out.println("The mean is " + sum / 20);
    }
    
}
