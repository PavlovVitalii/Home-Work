package com.itbulls.learnit.pavlovHW6;

public class Lollipops extends Candy {
	private String colourant;
	private String flavor;

	public Lollipops(String name, int weight, int sugar, String colourant, String flavor) {
		super(name, weight, sugar);
		this.colourant = colourant;
		this.flavor = flavor;
	}
}
