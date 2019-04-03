package Arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HourGlass {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int maxSum = arr[0][0] + arr[0][1] + arr[0][2] + arr[1][1] + arr[2][0] + arr[2][1] + arr[2][2];

        int sum;

        for (int i=0; i < arr.length - 2; i++) {

            for (int j=0; j < arr.length - 2; j++) {
                sum = 0;
                for (int k = j; k < j+3; k++) {
                    sum += arr[i][k];
                }
                sum += arr[i+1][j+1];
                for (int k = j; k < j+3; k++) {
                    sum+= arr[i+2][k];
                }

                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        HourGlass hourGlass = new HourGlass();
        int[][] arr = new int[][]{
            {1,1,1,0,0,0},
            {0,1,0,0,0,0},
            {1,1,1,0,0,0},
            {0,0,2,4,4,0},
            {0,0,0,2,0,0},
            {0,0,1,2,4,0}
        };
        System.out.println(hourGlass.hourglassSum(arr));

    }
}
