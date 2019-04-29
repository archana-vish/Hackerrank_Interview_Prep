package Practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int tot = 0;

        if ( n == 0) {
            return 0;
        }

        List<Integer> listOfSocks = new ArrayList<>();
        for (int num : ar) {
            listOfSocks.add(num);
        }

        //System.out.println(listOfSocks);

        Map<Integer, Integer> mapOfPairs = new HashMap<>();
        HashMap<Integer, Long> collect = listOfSocks.stream().collect(Collectors.groupingBy(k -> k, HashMap::new, Collectors.counting()));
        for (Long value : collect.values()) {
            tot += (value/2);
        }
        System.out.println(tot);
        return tot;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = 9;

        int[] ar = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};

        int result = sockMerchant(n, ar);

        scanner.close();
    }
}
