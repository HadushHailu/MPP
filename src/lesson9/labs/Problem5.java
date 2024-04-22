package lesson9.labs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Problem5 {
    public static void main(String[] args) {
        PrintList( streamSection(nextStream(),1,3)
                .collect(Collectors.toList())
        );
        PrintList( streamSection(nextStream(),0,4)
                .collect(Collectors.toList())
        );
        PrintList( streamSection(nextStream(),2,5)
                .collect(Collectors.toList())
        );
    }
    public static Stream<String> streamSection(Stream<String> stream, int m, int n) {
        return stream
                .skip(m)
                .limit(n-m+1);

    }
    private static Stream<String> nextStream() {
        return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh",
                "iii").stream();
    }
    private static void PrintList(List<String> lst){
        for (int i=0;i<lst.size()-1;i++){
            System.out.print(lst.get(i)+",");
        }
        System.out.print(lst.get(lst.size()-1) + "\n");
    }
}
