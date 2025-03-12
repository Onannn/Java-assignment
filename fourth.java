package Ellis;
import java.util.Scanner;
public class fourth {
    public static void main (String[] args) {
        Scanner var = new Scanner(System.in);
        int[] array = new int[10];

        for(int i = 0; i < 10 ; i++) {
            System.out.print("Enter value for index " +i);
            array[i] = var.nextInt();
        }

        for(int i = 0; i <10; i++) {
            System.out.print(array[i]);
            System.out.println("");
        }

    }
    
}
