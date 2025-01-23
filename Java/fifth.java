package Java;
import java.util.Scanner;
public class fifth {
    public static void main(String [] args) {
        int[][] array = new int [10] [10];
        Scanner num = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("Enter value for index " + i + " " + j + " ");
                array[i][j] = num.nextInt();
            }
        }
        System.out.print("The numbers you entered are ");
        for(int [] row: array) {
            for(int value: row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
    
}
