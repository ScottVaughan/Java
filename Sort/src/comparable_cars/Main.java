package comparable_cars;
import java.util.*;

/*** A simple sorting program that takes in a list of cars and 
 * 	 and sorts them (alphabetical) according to model and cost
 * 	 author: Scott Vaughan
 * 	 date: september 26, 2015
 ***/
public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Main main = new Main();
		Cars CT6 = new Cars("Cadillac CT6", 200);
		Cars Mustang = new Cars("Ford Mustang", 450);
		Cars Camaro = new Cars("Chevrolet Camaro", 100);
		Cars Malibu = new Cars("Chevrolet Malibu", 500);
		Cars Mazda = new Cars("Mazda 3", 50);
		
		
		List<Cars> cars = new ArrayList<Cars>();
		cars.add(CT6);
		cars.add(Mustang);
		cars.add(Camaro);
		cars.add(Malibu);
		cars.add(Mazda);
		
		System.out.println("List sorted by model order");
		Collections.sort(cars);
		main.print(cars);
		
		System.out.println("List sorted by cost order");
		// Sorts the array list using comparator
		Collections.sort(cars, new Cars());//Collections is not the same as Collection
		main.print(cars);
	}
	
	void print(List<Cars> cars){
		for(Cars listCars: cars){
			System.out.println("model: " + listCars.getModel() + "  " +
								"cost: " + listCars.getCost() + "  ");
		}
		System.out.println();
	}
}
