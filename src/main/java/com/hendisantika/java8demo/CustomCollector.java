package com.hendisantika.java8demo;

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

public class CustomCollector {
}


