package demo;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("eins","zwei","drei","vier");
		
		Iterator<String> it = strings.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());

	}

}
