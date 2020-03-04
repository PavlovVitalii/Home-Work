package com.pavlov.HW7;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		FileHW.countFiles(FileHW.file);
System.out.println(FileHW.count);
FileHW.onlyJava(FileHW.path,4);
	}

}
