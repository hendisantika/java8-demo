package com.hendisantika.java8demo.deepcopy;

import com.hendisantika.java8demo.data.Customer;
import com.hendisantika.java8demo.data.Order;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created by IntelliJ IDEA.
 * Project : java8-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-31
 * Time: 05:39
 */
public class JavaDeepCloneBySerialization {
    public static void main(String[] args) {

        Order order = new Order("12345", 100.45, "In Progress");
        Customer customer = new Customer("Test", "CUstomer", order);

        Customer cloneCustomer = deepClone(customer);
        order.setOrderStatus("Shipped");
        System.out.println(cloneCustomer.getOrder().getOrderStatus());

    }

    public static <T> T deepClone(T object){
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(object);
            ByteArrayInputStream bais = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(bais);
            return (T) objectInputStream.readObject();
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
