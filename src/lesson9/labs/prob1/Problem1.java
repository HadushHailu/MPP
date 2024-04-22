package lesson9.labs.prob1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem1 {
    public static void main(String[] args) {

        Stream<String> stringStream = Arrays.asList("Bill", "Thomas", "Mary").stream();
        System.out.println(stringStream.collect(Collectors.joining(", ")));
    }
}
