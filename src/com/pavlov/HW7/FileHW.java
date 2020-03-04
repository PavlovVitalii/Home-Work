package com.pavlov.HW7;


import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FileHW {
	public static int count;
	public static File file = new File("C:\\Users\\Admin\\Desktop\\Text");
	public static Path path = Paths.get("C:\\Users\\Admin\\Downloads\\OperatorsHW\\src");
    public static String only; 
	public static int countFiles(File file) {
		boolean a = file.exists();
		if (a == true && count < file.list().length) {
			count++;
			countFiles(file);
		}

		return count;
	}

	
	  public static void onlyJava(Path path, int maxDepth) throws IOException { 
		   try(Stream<Path> stream = Files.walk(path, maxDepth)){
			  String joined = stream
				        .map(String::valueOf)
				        .filter(pa -> pa.endsWith(".java"))
				        .collect(Collectors.joining(" \n"));
				    System.out.println( joined );
				    
		  }
		  

	  
	  }
	 

	}



