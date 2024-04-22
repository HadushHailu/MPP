package lesson9.labs.prob7b;

import lesson9.labs.prob7b.Employee;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final Function<List<Employee>,String> FilterEmployee = emps ->
            emps.stream()
                    .filter(a->a.getSalary()>100_000)
                    .filter(a->a.lastName.toUpperCase().charAt(0)>77)
                    .map(a->a.getFirstName()+" "+a.getLastName())
                    .sorted()
                    .collect(Collectors.joining(","));
}
