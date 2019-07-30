package com.hendisantika.java8demo;

import com.hendisantika.java8demo.data.Customer;
import com.hendisantika.java8demo.data.Order;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

/**
 * Created by IntelliJ IDEA.
 * Project : java8-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-31
 * Time: 05:46
 */
public class CopyConstructorTest {
    @Test
    public void testCopyConstructor(){

        Order order = new Order("12345", 100.45, "In Progress");
        Customer customer = new Customer("Test", "Customer", order);
        Customer customerCopy = new Customer(customer);

        order.setOrderStatus("Shipped");
        assertNotEquals(customer.getOrder().getOrderStatus(), customerCopy.getOrder().getOrderStatus());
    }
}
