package com.hendisantika.java8demo;

import java.util.EnumSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * Created by IntelliJ IDEA.
 * Project : java8-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-30
 * Time: 21:19
 */

class Student {
    int marks;

    Student() {
    }

    public Student(int i) {
        this.marks = i;
    }

    Student addMarks(Student s) {
        return new Student(this.marks = this.marks + s.marks);
    }

}

class StudentCollector implements Collector<Student, Student, Student> {
    @Override
    public Supplier<Student> supplier() {
        return Student::new;
    }

    @Override
    public BiConsumer<Student, Student> accumulator() {
        return Student::addMarks;
    }

    @Override
    public BinaryOperator<Student> combiner() {
        return Student::addMarks;
    }

    @Override
    public Function<Student, Student> finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return EnumSet.of(IDENTITY_FINISH);
    }
}

public class CustomCollector {
}


