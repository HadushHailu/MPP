package lesson9.labs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Problem2 {
    public static void main(String[] args) {
        Problem2();
    }

    public static void Problem2(){
        List<Integer> lst= Arrays.asList(4,7,1,9,45);

        Comparator<Integer> comparator=Integer::compare;

        int max = lst.stream()
                .max(comparator)
                .get();

        int min= lst.stream()
                .min(comparator)
                .get();

        System.out.println("Max value : " + max);
        System.out.println("Min value : " + min);
    }
}
