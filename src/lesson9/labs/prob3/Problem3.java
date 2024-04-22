package lesson9.labs.prob3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("cow", "cats", "dogs");
        System.out.println(countWords(words, 'c', 'd', 4));
    }
    public static int countWords(List<String> words, char c, char d, int len){
         return (int) words.stream().filter(w-> w.length() ==len)
                        .filter(w-> w.contains(String.valueOf(c)))
                        .filter(w-> !w.contains(String.valueOf(d)))
                        .count();
    }
}
