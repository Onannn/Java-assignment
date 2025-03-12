package Ellis;

public class Ellis {
    public static void main(String[] args) {
        //Using a nested loop

        for(int row = 0; row < 4; row++) {  //for loop declaring rows
            for(int col = 0; col < 12; col++) {  //for loop declaring columns
                if(col < 4 || col > 7) {      //condition to be met
                    System.out.print("*");
                }else {
                    System.out.print("=");
                }
            }
            System.out.println("");  //moves to a newline when a line is complete
        }

        //using a single loop
        

    }
}