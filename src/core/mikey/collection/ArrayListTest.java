package core.mikey.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
	public static String output="";
	public static void foo(int i){
		try{
			if(i == 1){
				throw new Exception();
			}
		}catch(Exception ex){
			output += "2";
			return;
		}finally{
			output += "3";
		}
		output += "4";
	}
	public static void main(String[] args) {
		foo(0);
		foo(1);
		System.out.println(output);
		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		list.add(2);
//		list.add(3);
//		list.get(0);
	}

}
