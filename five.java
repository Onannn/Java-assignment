package Ellis;
import java.util.Scanner;
public class five {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        Scanner var = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            for(int j = 0; j <10; j++) {
                System.out.print("Enter value for index " +i +" " + j);
                array[i][j] = var.nextInt();
            }
        }

        for(int i = 0; i < 10; i++){
            for(int j =0; j <10; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }



    }
    
}
