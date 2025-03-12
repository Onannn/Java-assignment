package Ellis.EXercise;

public class six {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 3, 7, 10, 13, 6};
        int even = 0;
        int odd = 0; 

        for(int i = 0; i <numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                even += numbers[i];
            } else {
                odd += numbers[i];
            }
        }
        System.out.println("Sum even " +even);
        System.out.print("Sum odd " +odd);
 
    }
    
}
