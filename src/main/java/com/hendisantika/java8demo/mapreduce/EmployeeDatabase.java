package com.hendisantika.java8demo.mapreduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by IntelliJ IDEA.
 * Project : java8-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 01/03/21
 * Time: 05.45
 */
public class EmployeeDatabase {
    public static List<Employee> getEmployees() {
        return Stream.of(new Employee(101, "john", "A", 60000),
                new Employee(109, "peter", "B", 30000),
                new Employee(102, "mak", "A", 80000),
                new Employee(103, "kim", "A", 90000),
                new Employee(104, "json", "C", 15000))
                .collect(Collectors.toList());
    }
}
