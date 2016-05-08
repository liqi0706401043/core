package com.mikey.sort;

public class Main {

	public static void main(String[] args) {
		Integer[] a = {5, 1, 3, 9, 2, 4, 6, 10, 8};
//		SortCollections.bubbleSort(a);
		SortCollections.quickSort(a, 0, a.length - 1);
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
