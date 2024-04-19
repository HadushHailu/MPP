package lesson9.labs;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Problem4 {
    public static void main(String[] args) {
        printSquares(3);
    }
    public static void printSquares(int num){
       IntStream.iterate(1, a->a+1)
                .limit(num)
                .map(a->a*a)
                .forEach(a-> System.out.print(a+" "));

    }
}
