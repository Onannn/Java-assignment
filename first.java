package Ellis.More;
import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        int [] [] array = new int [3][3];
        int high = 0;
        
        
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                    System.out.print("Enter value for index " +i +" "+j);
                    array[i][j] = var.nextInt();
            }
        }


        for(int i = 0; i < array.length; i++) {
            for(int j =0; j < array[i].length; j++) {
                if(array[i][j] > high) {
                    high = array[i][j];
                }

            }
        }
        System.out.println(high);



        
        }
    }
    

