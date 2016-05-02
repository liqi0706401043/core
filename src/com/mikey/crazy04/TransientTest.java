package com.mikey.crazy04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class TransientTest {

	public static void main(String[] args) {
		try(
				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("transient.txt"));
				ObjectInputStream in = new ObjectInputStream(new FileInputStream("transient.txt"))
				){
			Person per = new Person("mikey", 12);
			out.writeObject(per);
			Person p = (Person)in.readObject();
			System.out.println(p.getAge());
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
