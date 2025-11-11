package com.java.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileReadWriteMethods {
	public static void main(String[] args) throws IOException {
		String fileContent = "Sample text\n New Line Starts";
		Path filePath = Files.writeString(Files.createTempFile("demo", ".txt"), fileContent);
		System.out.println("File Path : " + filePath);
		System.out.println(Files.readString(filePath).equals(fileContent));
		System.out.println(Files.deleteIfExists(filePath));
	}
}