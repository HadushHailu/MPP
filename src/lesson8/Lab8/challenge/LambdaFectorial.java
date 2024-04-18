package lesson8.Lab8.challenge;

import java.util.function.Function;

public class LambdaFectorial {

    static Function<Integer,Integer> l = (x)->x==0?1:x*LambdaFectorial.l.apply(x-1);

    public static void main(String[] args) {
        System.out.println(l.apply(5));
    }
}
