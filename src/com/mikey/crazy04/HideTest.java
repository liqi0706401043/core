package com.mikey.crazy04;

class Parent{
	public static String tag = "fengkuang";
	public static void m(){
		System.out.println("1");
	}
}
class Derived extends Parent{
	public static String tag = "derived";
	public static void m(){
		System.out.println("2");
	}
}
public class HideTest {

	public static void main(String[] args) {
		Parent d = new Derived();
		d.m();
		System.out.println(d.tag);
		System.out.println(d.tag);
	}

}
