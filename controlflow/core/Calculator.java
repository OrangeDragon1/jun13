package controlflow.core;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        int count = 0;

        while(true) {
            System.out.print("Please enter an integer: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                count++;
                int number = scanner.nextInt();
                sum += number;
                avg = (double) sum / count;
            } else {
                break;
            }
            scanner.nextLine();
        }
        long roundedAvg = Math.round(avg);
        System.out.printf("SUM = %d AVG = %d.\n", sum, roundedAvg);
    }

}
