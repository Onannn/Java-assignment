package Ellis.EXercise;
import java.util.Scanner;
public class FIRST {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        int num = input.nextInt();  //collect the number from the user

        for(int i = 0; i < 6; i++) {   //loop for the row
            for(int j = 0; j <4; j++) {  //loop for columns
                System.out.print(num);  //print out the number
            }
            System.out.println("");   //Skips a line after the first row
        }

    }

    
}
