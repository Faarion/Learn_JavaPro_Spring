package by.prakharenkau_yauheniy.learn.nail.java_pro;

import java.util.Arrays;

public class Test {
	
	
	public static void main(String[] args) {	
		String a = "Hello.there.hey";
		String[] words = a.split("\\.");
		System.out.println("Result 1: " + Arrays.toString(words));
		
		a = "Hello254354234there645765765hey";
		words = a.split("\\d+");
		System.out.println("Result 2: " + Arrays.toString(words));
		
		String b = "Hello there heys";
		b = b.replace(" ", ".");
		System.out.println("Result 3: " + b);

		b = "Hello213213there342543241heys";
		String modifiedB1  = b.replaceAll("\\d+", "-");
		String modifiedB2 = b.replaceFirst("\\d+", "-");
		System.out.println("Result 3: " + modifiedB1);
		System.out.println("Result 3: " + modifiedB2);
	}	
}
