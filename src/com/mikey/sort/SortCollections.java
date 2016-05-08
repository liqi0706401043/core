package com.mikey.sort;

import java.util.List;

public final class SortCollections {
	public static  <T extends Comparable<? super T>> void bubbleSort(T[] list){
		int len = list.length;
		for(int i = 0; i < len - 1; i++){
			for(int j = i + 1; j < len; j++){
				if(list[i].compareTo(list[j]) > 0){
					T temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
	}
	
//	public static <T extends Comparable<? super T>> void bubbleSort(List<T> list){
//		int len = list.size();
//		for(int i = 0; i < len -1; i++){
//			for(int j = i + 1; j < len; j++){
//				if(list.get(i).compareTo(list.get(j)) > 0){
//					T temp = list.get(i);
//					list.get(i) = list.get(j);
//				}
//			}
//		}
//	}
	
	public static <T extends Comparable<? super T>> void insertSort(T[] list){
		
	}
	
	public static <T extends Comparable<? super T>> void selectSort(T[] list){
		
	}
	
	public static <T extends Comparable<? super T>> int getMiddle(T[] list, int low, int high){
		T privot = list[low];
		while(low < high){
			while(low < high && privot.compareTo(list[high]) < 0)
				high--;
			list[low++] = list[high];
			while(low < high && privot.compareTo(list[low]) > 0)
				low++;
			list[high--] = list[low];
		}
		list[low] = privot;
		return low;
	}
	
	public static <T extends Comparable<? super T>> void quickSort(T[] list, int low, int high){
		while(low < high){
			int mid = getMiddle(list, low, high);
			quickSort(list, low, mid - 1);
			quickSort(list, mid + 1, high);
		}
	}
}
