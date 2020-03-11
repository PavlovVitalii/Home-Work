package com.pavlov.HW7;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException  {
	FileHW7.countFiles(FileHW7.file);
	System.out.println(FileHW7.count);
	FileHW7.onlyJava(FileHW7.path,4);

	}

}
