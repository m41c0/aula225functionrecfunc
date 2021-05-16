package entities;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

	public double filterdSum(List<Product> list, Predicate<Product> criteira) {
		double sum = 0.0;
		for (Product p : list) {
			if (criteira.test(p)){
				sum += p.getPrice();
			}
		}
		return sum;
	}
	
	
}
