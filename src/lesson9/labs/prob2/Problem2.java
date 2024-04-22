package lesson9.labs.prob2;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Problem2 {
    public static void main(String[] args) {

        Stream<Integer> myIntStream = Stream.of(1, 8, 2, 7, 3, 4, 5);

        IntSummaryStatistics summary = myIntStream.collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println("Min value: " + summary.getMin());
        System.out.println("Max value: " + summary.getMax());
    }
}
