package com.itbulls.learnit.pavlovHW6;

public class ChocolateCandies extends Candy {
	double cocaoa;
	double nuts;

	public ChocolateCandies(String name, int weight, int sugar, double cocaoa, double nuts) {
		super(name, weight, sugar);
		this.cocaoa = cocaoa;
		this.nuts = nuts;
	}

	public ChocolateCandies(String name, int weight, int sugar, double cocaoa) {
		super(name, weight, sugar);
		this.cocaoa = cocaoa;

	}

}
