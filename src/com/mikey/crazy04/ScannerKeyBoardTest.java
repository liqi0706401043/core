package com.mikey.crazy04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerKeyBoardTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		while(sc.hasNext()){
//			System.out.println("content:" + sc.next());
//		}
		List<Integer> list = new ArrayList<Integer>();
		while(sc.hasNextInt()){
			int temp = sc.nextInt();
			if(temp == -1)
				break;
			else{
				list.add(temp);
			}
			
//			System.out.println("content:" + sc.nextInt());
		}
		System.out.println(list);
	}

}
