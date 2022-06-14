package controlflow.core;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        // console entered users
        Scanner scanner = new Scanner(System.in);

        // init min max variables
        // int min = 0, max = 0;
        // boolean first = true;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt(); // check if input is int, returns boolean

            if (isAnInt) {
                int number = scanner.nextInt();

                // if(first) {
                //     min = number;
                //     max = number;
                //     first = false;
                // }

                if (number > max) {
                    max = number;
                }

                if (number < min) 
                    min = number;

            } else {
                break;
            }
            scanner.nextLine(); // handle enter
        }

        System.out.printf("min = %d, max = %d.\n", min, max);
        scanner.close();
    }
}
