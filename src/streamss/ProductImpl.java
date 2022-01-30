package streamss;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductImpl {

	public static void main(String[] args) {
		
		List<Product> l = new ArrayList<>();
		
		l.add(new Product(101, "Hundai", 50.50));
		l.add(new Product(102, "Honda", 100.50));
		l.add(new Product(103, "Maruti", 30.30));
		l.add(new Product(104, "Tata", 60.50));
		
		List<Product> collect = l.stream().filter(p->p.price>50).collect(Collectors.toList());
		
		for(Product collect1 : collect) {
			System.out.println(collect1.price);
		}
		
		List<String> collect2 = l.stream().filter(p->p.price>50)
						.map(p->p.name).collect(Collectors.toList());
		
		System.out.println(collect2);
		
	}

}
