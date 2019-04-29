package Practice;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CloudJump {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

        int tot = 0, index = 0;

        if (c.length == 0) {
            return 0;
        }

        Map<Integer, Integer> mapOfClouds = new HashMap<>();
        for (int n : c) {
            mapOfClouds.put(index++, n);
        }

        System.out.println(mapOfClouds.size());

        for (int key = 0; key < mapOfClouds.size() - 1;) {

            System.out.println(key + "..." + tot);
            if (((key + 2) < mapOfClouds.size()) && mapOfClouds.get(key + 2) == 0) {
                key += 2;
            } else {
                key++;
            }

            tot += 1;
        }

        System.out.println(tot);
        return tot;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = 7;

        int[] c = new int[]{0, 0, 1, 0, 0, 1, 0};

        int result = jumpingOnClouds(c);

        scanner.close();
    }
}