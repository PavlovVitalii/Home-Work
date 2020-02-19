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
		for (int i = 0; i < Candy.box.length; i++) {
			switch (in.nextInt()) {
			case 1:
				Candy.box[i] = iris;
				System.out.println("Вы выбрали\"Золотой ключик\"");
				break;
			case 2:
				Candy.box[i] = chocoladcandis;
				System.out.println("Вы выбрали\"Красный мак\"");
				break;
			case 3:
				Candy.box[i] = chocolateCandies2;
				System.out.println("Вы выбрали\"Каракум\"");
				break;
			case 4:
				Candy.box[i] = lollipops;
				System.out.println("Вы выбрали\"Chupa Chups\"");
				break;
			default:
				System.out.println("Не верное значение выбирите:1,2,3 или 4");
				break;
			}

		}
		int weightBox = 0;
		for (int i = 0; i < Candy.box.length; i++) {
			weightBox += Candy.box[i].getWeight();
		}
		System.out.println("Вес коробки: " + weightBox + " г.");
		System.out.println("Введите диапозон содержания сахара:");
		int a = in.nextInt();
		int b = in.nextInt();
		for (int i = 0; i < Candy.box.length; i++) {
			if (Candy.box[i].getSugar() >= a && Candy.box[i].getSugar() <= b) {
				System.out.println(Candy.box[i].getName() + " " + Candy.box[i].getWeight() + " г. "
						+ "Содержание сахара:" + Candy.box[i].getSugar());
			}
		}
		
               Candy.sortCandy(Candy.box);
               for (int i = 0; i < Candy.box.length;i++) {
            	   System.out.println(Candy.box[i].getName() + " " + Candy.box[i].getWeight() + " " + Candy.box[i].getSugar());
			}

	}

}
