package lesson9.labs.prob7a;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));

		//Problem 7a
		System.out.println(list.stream()
					.filter(a->a.getSalary()>100_000)
					.filter(a->a.lastName.toUpperCase().charAt(0)>77)
					.map(a->a.getFirstName()+" "+a.getLastName())
				    .sorted()
				 	.collect(Collectors.joining(","))
		  );
	}

}
