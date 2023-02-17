package Application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import Entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 1900.00));
		list.add(new Product("PC", 4900.00));
		list.add(new Product("CADEIRA", 200.00));
		
		Comparator<Product> comp = (p1, p2) ->  p1.getName().toUpperCase().compareTo(p2.getName().toLowerCase());
		
		list.sort(comp);
		
		for(Product p : list) {
			System.out.println(p);
		}
		
	}

}
