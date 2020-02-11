package com.itbulls.learnit.pavlov;
import java.util.Scanner;


public class HomeWork_1 {
	
	public static void areaOfTriangle(){
		System.err.println("Enter length of the side A");
		double a = new Scanner(System.in).nextDouble();
		System.err.println("Enter length of the side B");
		double b = new Scanner(System.in).nextDouble();
		System.err.println("Enter length of the side C");
		double c = new Scanner(System.in).nextDouble();
		double p = (a + b + c)/2;
		double area = Math.sqrt(p*(p - a) * (p - b) * (p - c));
		System.out.println("Area of triangle : " + area);
	}
	
	
	public static void circumference(){
		System.out.println("Enter circle radius");
		double radius = new Scanner(System.in).nextDouble();
		double circumference = 2 * Math.PI * radius;
		System.out.println("Circumference :" + circumference); 
	}
	
	
}
