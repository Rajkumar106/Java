package com.project10;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class FileHandlingPractice {
	public static void main(String[] args) throws IOException {
		
		File f=new File("D:\\fileHandling java\\practice\\selfIntroduction.txt");
		//System.out.println(f.mkdir());
		boolean newFile = f.createNewFile();
		//System.out.println(newFile);
		System.out.println(f.canExecute());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		
		Files.writeString(f.toPath(), "Hello, Iam Rajkumar currently pursuiving Computer science Engineering", StandardOpenOption.APPEND);
		
		
	}
	
	
}
