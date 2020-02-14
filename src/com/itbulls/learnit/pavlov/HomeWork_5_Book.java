package com.itbulls.learnit.pavlov;

public class HomeWork_5_Book {
	static Book[] books = new Book[10];

	public static void main(String[] args) {
		books[0] = new Book(103,"Number the Stars","���� �����", "Svitanok", 1995, 500, 250, "�������");
		books[1] = new Book(23, "Winnie-the-Pooh","���� ����", "Ranok", 2000, 350, 150, "������");
		books[2] = new Book(654, "Bridge to Terabithia","������ ��������", "Svitanok", 2005, 300, 180, "������");
		books[3] = new Book(324,"Destroyed diary ","Smit Keri", "IPIO", 2017, 225, 72, "������");
		books[4] = new Book(45, "Mary Poppins","������ �������", "ACCA", 1998, 700, 250, "�������");
		books[5] = new Book(67, "Number the Stars","���� �����", "ACCA", 2010, 550, 300, "�������");
		books[6] = new Book(6788, "Son","���� �����", "Clever", 1999, 600, 270, "�������");
		books[7] = new Book(435, "The Master Puppeteer","������ ��������", "IPIO", 2002, 260, 170, "������");
		books[8] = new Book(455, "The Same Stuff as Stars","������ ��������", "Cristal Book", 2016, 380, 200, "������");
		books[9] = new Book(1567, "Jip, His Story","������ ��������", "Ranok", 2000, 450, 250, "�������");
		  Book.printAuthor("������ ��������");
          Book.printPublishingHouse("ipio");
          Book.printAfterDate(2010);
	}

	static class Book {
		int id;
		String name;
		String author;
		String publishingHouse;
		int year;
		int pages;
		int price;
		String binding;

		public Book(int id,String name, String author, String publishingHouse, int year, int pages, int price, String binding) {
			this.id = id;
		    this.name = name;
			this.author = author;
			this.publishingHouse = publishingHouse;
			this.year = year;
			this.pages = pages;
			this.price = price;
			this.binding = binding;

		}

		static public void printAuthor(String author) {
			int count = 0;
			for (int i = 0; i < books.length; i++) {
				if (books[i].author.equalsIgnoreCase(author)) {
					System.out.println(books[i].toString());
					count++;
				}

			}
			if (count == 0)
				System.out.println("���� ��������� ������ ���.");
		}

		static public void printPublishingHouse(String publishingHouse) {
			int count = 0;
			for (int i = 0; i < books.length; i++) {
				if (books[i].publishingHouse.equalsIgnoreCase(publishingHouse)) {
					System.out.println(books[i].toString());
					count++;
				}

			}
			if (count == 0)
				System.out.println("���� ��������� ������������  ���.");
		}

		static public void printAfterDate(int year) {
			int count = 0;
			for (int i = 0; i < books.length; i++) {
				if (books[i].year > year) {
					System.out.println(books[i].toString());
					count++;
				}

			}
			if (count == 0)
				System.out.println("���� ����� ��������� ���� ���.");
		}

		@Override
		public String toString() {
			return "id: " + id + ", " + "��������: " + name + ", " + "�����: " + author + ", " + "������������: " + publishingHouse + ", " 
					+ "���: " + year + ", " + "�������: " + pages + ", " + "����: " + price + ", " + "��������: " + binding;
		}
	}

}
