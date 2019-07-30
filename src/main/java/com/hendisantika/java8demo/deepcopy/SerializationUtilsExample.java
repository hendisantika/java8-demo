package com.hendisantika.java8demo.deepcopy;

import com.hendisantika.java8demo.data.Customer;
import com.hendisantika.java8demo.data.Order;
import org.apache.commons.lang3.SerializationUtils;

/**
 * Created by IntelliJ IDEA.
 * Project : java8-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-31
 * Time: 05:40
 */
public class SerializationUtilsExample {
    public void deepClone(Order order, Customer customer){

        Customer cloneCustomer = SerializationUtils.clone(customer);
    }
}
