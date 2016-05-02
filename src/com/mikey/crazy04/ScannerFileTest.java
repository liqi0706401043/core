package com.mikey.crazy04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileTest {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("src/com/mikey/crazy04/ScannerFileTest.java"));
		
		while(sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
		
	}

}
