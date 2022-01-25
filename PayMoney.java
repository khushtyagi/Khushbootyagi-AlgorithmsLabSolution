package khusub.question1;

import java.util.Scanner;

public class PayMoney {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of transaction array");
        int numOfTrans = scanner.nextInt();
		int[] transactions = new int[numOfTrans];

		System.out.println("Enter the values of array");

		for (int i = 0; i < numOfTrans; i++)
            transactions[i] = scanner.nextInt();

        System.out.println("Enter the total no of targets that needs to be achieved");
        int numberOfTarget = scanner.nextInt();

        while (numberOfTarget != 0) {
            int flag = 0;
            System.out.println("Enter the value of target");
            int target = scanner.nextInt();
            int sum = 0;

            for (int i = 0; i < numOfTrans; i++) {
                sum = sum + transactions[i];
                if (sum >= target) {
                    System.out.println("Target achieved after " + (i + 1) + " transactions");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Given target is not achieved");
            }
            numberOfTarget--;
			System.out.println();
        }
    }
}