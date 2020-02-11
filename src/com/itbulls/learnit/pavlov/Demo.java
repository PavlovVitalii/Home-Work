package com.itbulls.learnit.pavlov;

import java.util.Arrays;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// task 1
		Scanner in = new Scanner(System.in);

		System.out.println("Enter integer numbers separated by space:");
		String[] input = in.nextLine().split(" ");
		int[] numbers = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			numbers[i] = Integer.parseInt(input[i]);
		}
		System.out.println(HomeWork4Methods.max(numbers));

		// task 2

		System.out.println("Enter height of the rectangle:");
		int height = in.nextInt();
		System.out.println("Enter width of the rectangle");
		int width = in.nextInt();
		HomeWork4Methods.rectangle(height, width);

		// task 3

		System.out.println("Enter some text:");
		String input1 = in.nextLine();
		HomeWork4Methods.printWordCount(input1);

		// task 4

		System.out.println("Enter some words separated by space:");
		String[] words = in.nextLine().split(" ");
		System.out.println(Arrays.toString(HomeWork4Methods.sortWords(words)));
	}

}
