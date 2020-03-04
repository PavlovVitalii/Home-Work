package com.pavlov.HW7;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.module.FindException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileHW7 {
	public static int count;
	public static File file = new File("C:\\Users\\Admin\\Desktop\\Text");
	public static File file2 = new File("C:\\Users\\Admin\\Downloads\\OperatorsHW\\src\\com\\pavlov\\HW7");

	public static int countFiles(File file) {
		while (count < file.list().length) {
			file.exists();
			count++;
			countFiles(file);
		}
		return count;
	}

	public static void onlyJava(File file2) {
		File[] files = file2.listFiles();
		for (int i = 0; i < files.length;i++) {
		System.out.println(files[i]);
		}


	
	}
}
