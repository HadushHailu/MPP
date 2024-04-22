package lesson9.labs.prob8;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).
        List<Transaction> transactionList=transactions.stream()
                                            .filter(a->a.getYear()==2011)
                                            .sorted(Comparator.comparing(a->a.getValue()))
                                            .collect(Collectors.toList());
        transactionList.forEach(System.out::println);

        // Query 2: What are all the unique cities where the traders work?
        List<Trader> traderList=transactions.stream()
                                .map(a->a.getTrader())
                                .collect(Collectors.toList());

        List<String> uniqueCity=traderList.stream()
                                        .map(a->a.getCity())
                                        .distinct()
                                        .collect(toList());

        System.out.println("\n Unique cities:");
        uniqueCity.forEach(System.out::println);

        // Query 3: Find all traders from Cambridge and sort them by name.
        List<Trader> traders=traderList.stream()
             .filter(a->a.getCity().equals("Cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .distinct()
                .collect(Collectors.toList());

        System.out.println("All sorted Trader from Cambridge");
        traders.forEach(System.out::println);
        
        // Query 4: Return a string of all traders names sorted alphabetically.
        String traderStr = traderList.stream()
                .map(a->a.getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));

        System.out.println("String of all traders sorted alphabetically:");
        System.out.println(traderStr);

        // Query 5: Are there any trader based in Milan?
        String milanTrader = traderList.stream()
                .filter(a->a.getCity().equals("Milan"))
                .count() >0 ?"YES" : "NO";
        System.out.println("Are there any trader based in Milan? " +milanTrader);

     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream()
                .filter(a->a.getTrader().getCity().equals("Milan"))
                .forEach(a->a.getTrader().setCity("Cambridge"));

        System.out.println("\n\nAfter updating Milan to Cambridge");
        transactions.forEach(System.out::println);
        
        // Query 7: What's the highest value in all the transactions?
        int highestValue = transactions.stream()
                .max(Comparator.comparing(Transaction::getValue))
                .map(a->a.getValue())
                .get();

        System.out.println("Highest value in all transaction : " + highestValue);
    }
}
