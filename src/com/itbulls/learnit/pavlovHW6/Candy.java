package com.itbulls.learnit.pavlovHW6;

import java.util.Arrays;

public abstract class Candy {
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

	
	

}
