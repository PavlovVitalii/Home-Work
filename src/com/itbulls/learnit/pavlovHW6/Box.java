package com.itbulls.learnit.pavlovHW6;

public class Box {
	public static Candy[] boxArr = new Candy[8];
	public static void sortCandy(Candy[] box) {
		Candy buf = null;
		for (int i = 0; i < box.length; i++) {
			for (int j = 0; j < box.length - 1; j++) {
				if (box[j].getWeight() > box[j + 1].getWeight()) {
					buf = box[i];
					box[i] = box[j + 1];
					box[j + 1] = buf;

				}

			}
			
		}

	}


}
