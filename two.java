package Ellis;

public class two {
    public static void main(String[] args) {
//double loop  (Same process)
        for (int i = 0; i < 6; i++) {
            for(int j =0; j < 10; j++) {
                if(i == 0 && j < 4 || i == 1 && j < 4 || i == 2 && j <4) {
                    System.out.print("*");
                } else {
                    System.out.print("=");
                }
            }
            System.out.println(" ");
        }
    }
    
}
