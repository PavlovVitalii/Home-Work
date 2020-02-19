package com.itbulls.learnit.pavlovHW6;

import java.util.Arrays;

public abstract class Candy {
	public static Candy[] box = new Candy[8];
	private String name;
	private int weight;
	private int sugar;

	public Candy(String name, int weight, int sugar) {
		this.name = name;
		this.weight = weight;
		this.sugar = sugar;
	}

	public int getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public int getSugar() {
		return sugar;
	}

	public static void sortCandy(Candy[] box) {
		Candy buf = null;
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box.length - 1; j++) {
				
				if (box[i].getWeight() > box[j + 1].getWeight()) {
					buf = box[i];
					box[i] = box[j + 1];
					box[j + 1] = buf;

				}

			}
			
		}

	}

	

}
