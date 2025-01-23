package Java;

import java.util.Arrays;

public class third {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};
        
        double mean = calculateMean(numbers);
        System.out.println("Mean: " + mean);

        double median = calculateMedian(numbers);
        System.out.println("Median: " + median);
        double standardDeviation = calculateStandardDeviation(numbers, mean);
        System.out.println("Standard Deviation: " + standardDeviation);
    }

    public static double calculateMean(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    public static double calculateMedian(int[] numbers) {
        Arrays.sort(numbers);
        int middle = numbers.length / 2;

        if (numbers.length % 2 == 0) {
            return (numbers[middle - 1] + numbers[middle]) / 2.0;
        } else {
            return numbers[middle];
        }
    }

    public static double calculateStandardDeviation(int[] numbers, double mean) {
        double sumSquaredDifferences = 0.0;

        for (int num : numbers) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }

        return Math.sqrt(sumSquaredDifferences / numbers.length);
    }
}
    

