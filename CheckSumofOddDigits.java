package com.ogon.programs;

import java.util.Scanner;

public class CheckSumofOddDigits extends UserMainCode1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the positive integer number:");
		int num = scanner.nextInt();
		int res = checkSum(num);

		if (res == 1)
			System.out.println("Sum of integer digits is odd");
		else
			System.out.println("Sum of integer digits is even");

		scanner.close();
	}
}

class UserMainCode1 {

	public static int checkSum(int num) {

		int sum = 0;

		while (num > 0) {
			int rem = num % 10;
			sum += rem;
			num /= 10;
		}

		if (sum % 2 != 0)
			return 1;
		else
			return -1;

	}
}