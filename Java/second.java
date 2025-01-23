package Java;

public class second {
    public static void main(String[] args) {
        //Nested loop
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 12; j++) {
                if ( i < 3 && j < 4 ) {
                    System.out.print("*");
                } else {
                    System.out.print("=");
                }
            }
            System.out.println("");
        }
        //Single loop
        String flag = "";
        for (int i = 0; i < 60 ; i++) {
            if ( i < 4 || i > 11 & i < 16 || i > 23 & i < 28) {
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
