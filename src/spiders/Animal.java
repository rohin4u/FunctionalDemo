package spiders;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Animal {
	
	
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		
		l.add(45);
		l.add(100);
		l.add(30);
		l.add(130);
		l.add(50);
		
		List<Integer> collect = l.stream().filter(p->p>50).collect(Collectors.toList());
		
		System.out.println(collect);
		
		
	}

}
