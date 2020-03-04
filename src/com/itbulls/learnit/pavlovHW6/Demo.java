package com.itbulls.learnit.pavlovHW6;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Iris iris = new Iris("Золотой ключик", 14, 7, 2.25, 3.5);
		ChocolateCandies chocoladcandis = new ChocolateCandies("Красный мак", 16, 3, 4.5);
		ChocolateCandies chocolateCandies2 = new ChocolateCandies("Каракум", 17, 8, 7.5, 5.7);
		Lollipops lollipops = new Lollipops("Chupa Chups", 18, 6, "Orange", "Citrus");
		System.out
				.println("Выберите какую конфету добавить в коробку:\n 1 Золотой ключик \n 2 Красный мак\n 3 Каракум \n"
						+ " 4 Chupa Chups ");
		for (int i = 0; i < Box.boxArr.length; i++) {
			switch (in.nextInt()) {
			case 1:
				Box.boxArr[i] = iris;
				System.out.println("Вы выбрали\"Золотой ключик\"");
				break;
			case 2:
				Box.boxArr[i] = chocoladcandis;
				System.out.println("Вы выбрали\"Красный мак\"");
				break;
			case 3:
				Box.boxArr[i] = chocolateCandies2;
				System.out.println("Вы выбрали\"Каракум\"");
				break;
			case 4:
				Box.boxArr[i] = lollipops;
				System.out.println("Вы выбрали\"Chupa Chups\"");
				break;
			default:
				System.out.println("Не верное значение выбирите:1,2,3 или 4");
				break;
			}

		}
		int weightBox = 0;
		for (int i = 0; i < Box.boxArr.length; i++) {
			weightBox += Box.boxArr[i].getWeight();
		}
		System.out.println("Вес коробки: " + weightBox + " г.");
		System.out.println("Введите диапозон содержания сахара:");
		int a = in.nextInt();
		int b = in.nextInt();
		for (int i = 0; i < Box.boxArr.length; i++) {
			if (Box.boxArr[i].getSugar() >= a && Box.boxArr[i].getSugar() <= b) {
				System.out.println(Box.boxArr[i].getName() + " " + Box.boxArr[i].getWeight() + " г. "
						+ "Содержание сахара:" + Box.boxArr[i].getSugar());
			}
		}

		Box.sortCandy(Box.boxArr);
		for (int i = 0; i < Box.boxArr.length; i++) {
			System.out.println(
					Box.boxArr[i].getName() + " " + Box.boxArr[i].getWeight() + " " + Box.boxArr[i].getSugar());
		}

	}

}
