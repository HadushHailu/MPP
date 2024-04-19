package lesson9.labs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Problem1 {
    public static void main(String[] args) {
        Problem1();
    }

    public static void Problem1(){
        Stream<String> stringStream=Stream.of("Bill","Thomas","Mary");
        stringStream.forEach(a->System.out.print(a+ ","));
    }

}
