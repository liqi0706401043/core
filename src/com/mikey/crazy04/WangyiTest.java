package com.mikey.crazy04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.sun.xml.internal.ws.api.databinding.MappingInfo;

class Total implements Comparable<Total>{
	public int count = 0;
	public String province;
	Total(int n, String p){
		count = n;
		province = p;
	}
	@Override
	public int compareTo(Total o) {
		
		return count - o.count;
	}
	public String toString(){
		return "省份：" + province + "账户数量为："+ count + "\n";
	}
}
public class WangyiTest {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("src/1.txt"));
		Map<String, Integer> map = new HashMap<String, Integer>();
		while(sc.hasNextLine()){
			String str = sc.nextLine();
			String[] arr = str.split("\\|");
			if(! map.containsKey(arr[3])){
				map.put(arr[3], 1);
			}else{
				int count = map.get(arr[3]) + 1;
				map.put(arr[3], count);
			}
		}
		List<Total> list = new ArrayList<Total>();
		
		Iterator it = map.keySet().iterator();
		while(it.hasNext()){
			String province = (String) it.next();
			int count = map.get(province);
			list.add(new Total(count, province));
		}
		Collections.sort(list);
//		Arrays.sort(list);
		System.out.println(list);
	}

}
