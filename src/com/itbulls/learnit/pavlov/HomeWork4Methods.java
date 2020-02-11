package com.itbulls.learnit.pavlov;

import java.util.*;

public class HomeWork4Methods {
// task 1
	public static int max(int[] arr) {
		Arrays.sort(arr);
		int max = arr[arr.length - 1];
		return max;
	}

	// task 2

	public static void rectangle(int a, int b) {
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				if (i == 0 || i == a - 1)
					System.out.print("+");
				else if (j == 0 || j == b - 1)
					System.out.print("+");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

	// task 3
	public static void printWordCount(String str) {
		String[] arr = str.split(" ");
		System.out.println(arr.length);
	}

// task 4 

	public static String[] sortWords(String[] arr) {
		String s = null;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() > 3) {
				s += arr[i] + " ";
			}
		}
		String[] sortWords = s.split(" ");
		return sortWords;
	}
}
