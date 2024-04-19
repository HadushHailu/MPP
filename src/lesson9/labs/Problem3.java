package lesson9.labs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem3 {
    public static void main(String[] args) {
        List<String> lst= Arrays.asList("Apple","Character","Elephant","Green");
        System.out.println(countWords(lst,'A','G',5));

//        List<Integer> lst1=Arrays.asList(1,1,1);
//        List<Integer> lst2=Arrays.asList(2,4,6);
//        List<Integer> lst3=Arrays.asList(3,6,9);
//
//        List<List<Integer>> listOfList=Arrays.asList(lst1,lst2,lst3);
//
//        Stream<Integer> stream=listOfList.stream()
//                                .flatMap(a->a.stream());
//
//        stream.forEach(a->System.out.print(a+" "));

    }
    public static int countWords(List<String> words, char c, char d, int len){
        return words.stream()
                .filter(a->a.length()==len)
                .filter(a->a.contains(c+""))
                .filter(a->!a.contains(d+""))
                .collect(Collectors.toList())
                .size();
    }
}
