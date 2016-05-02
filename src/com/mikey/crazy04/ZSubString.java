package com.mikey.crazy04;

public class ZSubString {
	public static String zSubString(String s, int fromIndex, int toIndex){
		byte[] b = s.getBytes();
		String result="";
		int len = b.length;
		for(int i=fromIndex; i<toIndex && toIndex <= len; i++){
			
			result += b[i];
		}
		return result;
	}
	public static void main(String[] args) {
		String s = "我是zhongguore";
		String result = zSubString(s,1,4);
		System.out.println(result);
	}

}
