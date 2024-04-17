package lesson8.Lab8.challenge;

import java.util.function.Function;

public class LambdaFectorial {

    public int factorial(int n){
        Function<Integer,Integer> l = (x)->x==0?1:n*factorial(x);
        return l.apply(n-1);
    }


    public static void main(String[] args) {

        LambdaFectorial lf = new LambdaFectorial();
        System.out.println(lf.factorial(4));
    }
}
