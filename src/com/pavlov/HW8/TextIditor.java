package com.pavlov.HW8;

import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.util.stream.Stream;

public class TextIditor {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:\\Users\\Admin\\Desktop\\Text\\doc 1.txt");
		Scanner in = new Scanner(System.in);
		while (true) {
			String str = in.nextLine();
			if (str.equalsIgnoreCase("exit")) {
				break;
			}
			str += "\n";
			Files.write(path, str.getBytes(), StandardOpenOption.APPEND);

		}
		try (Stream<String> line = Files.lines(path)) {
			line.forEach(System.out::println);
		} catch (Exception e) {
		}
		try (Stream<String> line = Files.lines(path)) {
			long wordsCount = line.flatMap(s -> Stream.of(s.split("\\W+")).filter(t -> !t.isEmpty())).count();

			System.out.println("Number of words: " + wordsCount);
		} catch (Exception e) {

		}

	}

}
