package Java;
import java.util.Scanner;
public class fourth {
    public static void main(String[] args) {

        int [] array = new int[10];
        Scanner num =new Scanner(System.in);

        for ( int i = 0; i < array.length; i++ ) {
            System.out.print("Enter value for index " + i + " ");
            array[i] = num.nextInt();
        }
        System.out.println("The numbers are: ");
        for(int i : array) {
            System.out.println(i);
        }
    }
}
//Declare an array of length 10.
//Write a program using a loop to assign elements to the array by accepting input from the user.
//Make sure to state the index that the user’s input will be to the user before accepting the input.
//Using a for each loop, print out the input entered by the user.