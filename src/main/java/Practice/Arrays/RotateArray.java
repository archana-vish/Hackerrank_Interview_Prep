package Practice.Arrays;

import javafx.scene.transform.Rotate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RotateArray {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

       List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        int index = 0, size = a.length;

       for (int num : a) {
           if (index - d < 0) {
               list.set((size + index++) - d, num);
           } else {
               list.set(index++ - d , num);
           }
       }

        return list.stream().mapToInt(i->i).toArray();

    }


    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        int d = 4;

        rotLeft(a, d);
    }



}
