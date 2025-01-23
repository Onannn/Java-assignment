package Java;

public class first {
    public static void main(String[] args) {
        //nested loop
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 12; j++) {
                if( j > 3 && j < 8 ) {
                    System.out.print("=");
                } else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

        //single loop
        String flag = "";
        for (int i = 0; i < 48 ; i++) {
            if ( i % 12 < 4 || i % 12 > 7) {
                flag += "*";
            } else {
                flag += "=";
            }
            if ( i % 12 == 11) {
                flag += "\n";
            }

        }
        System.out.print(flag);
    } 
    
}
