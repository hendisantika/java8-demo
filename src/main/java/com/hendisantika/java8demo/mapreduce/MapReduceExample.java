package com.hendisantika.java8demo.mapreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : java8-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/03/21
 * Time: 05.47
 */
public class MapReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 2, 5, 8, 7, 3, 15);

        List<String> words = Arrays.asList("corejava", "spring", "hibernate");

        int sum = 0;
        for (int no : numbers) {
            sum += no;
        }
        System.out.println(sum);

        int sum1 = numbers.stream().mapToInt(i -> i).sum();
        System.out.println(sum1);

        Integer reduceSum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduceSum);

        Optional<Integer> reduceSumWithMethodReference = numbers.stream().reduce(Integer::sum);
        System.out.println(reduceSumWithMethodReference.get());

        Integer mulResult = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(mulResult);

    }
}
