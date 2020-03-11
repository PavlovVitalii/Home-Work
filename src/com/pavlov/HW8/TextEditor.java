package com.pavlov.HW8;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class TextEditor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Path path = Paths.get("C:\\Users\\Admin\\Desktop\\Text\\doc 1.txt");

		String s = in.nextLine();
		byte[] by = s.getBytes();
		try {
			Files.write(path, by);

		} catch (IOException e) {

			e.printStackTrace();
		}
		try (Stream<String> str = Files.lines(path)) {
			str.map(String::trim).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
