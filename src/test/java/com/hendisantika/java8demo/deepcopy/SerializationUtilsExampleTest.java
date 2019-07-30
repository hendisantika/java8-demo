package com.hendisantika.java8demo.deepcopy;

import com.hendisantika.java8demo.data.Customer;
import com.hendisantika.java8demo.data.Order;
import org.apache.commons.lang3.SerializationUtils;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

/**
 * Created by IntelliJ IDEA.
 * Project : java8-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-31
 * Time: 05:50
 */
public class SerializationUtilsExampleTest {
    @Test
    public void testDeepClone(){

        Order order = new Order("12345", 100.45, "In Progress");
        Customer customer = new Customer("Test", "CUstomer", order);
        Customer cloneCustomer = SerializationUtils.clone(customer);

        order.setOrderStatus("Shipped");
        assertNotEquals(customer.getOrder().getOrderStatus(), cloneCustomer.getOrder().getOrderStatus());
    }
}
