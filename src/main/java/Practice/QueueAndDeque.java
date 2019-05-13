package Practice;

import java.util.*;
import java.util.stream.Collectors;

public class QueueAndDeque {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);

        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        System.out.println(queue);
        queue.offer(20);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);


//
//        ArrayDeque<Integer> stack = new ArrayDeque<>();
//        stack.push(10);
//        System.out.println(stack);
//        stack.push(20);
//        System.out.println(stack);
//        stack.pop();
//        System.out.println(stack);


        System.out.println("====================");

        String equation = "[(a+b)]";
        Map<String, String> bracketMap = new HashMap<>();
        bracketMap.put("[","]");
        bracketMap.put("{","}");
        bracketMap.put("(",")");

        List<String> listOfBrackets = Arrays.stream(equation.split(""))
                .filter(a-> (bracketMap.containsKey(a) || bracketMap.containsValue(a) ))
                .collect(Collectors.toList());
        System.out.println(listOfBrackets);

        ArrayDeque<String> stack = new ArrayDeque<>();
        for (String b : listOfBrackets) {
            if (!stack.isEmpty()) {
                if (bracketMap.containsKey(b)) {
                    stack.push(b);
                } else if (bracketMap.containsValue(b) && bracketMap.get(stack.peek()).equals(b)) {
                    stack.pop();
                }
            } else {
                stack.push(b);
            }
        }

        System.out.println("Final stack:: " + stack.size());

    }
}
