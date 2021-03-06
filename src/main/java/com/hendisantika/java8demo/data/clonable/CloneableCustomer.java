package com.hendisantika.java8demo.data.clonable;

import com.hendisantika.java8demo.data.Order;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA.
 * Project : java8-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-31
 * Time: 05:37
 */
public class CloneableCustomer  implements Cloneable {

    private String firstName;
    private String lastName;
    private Order order;


    public CloneableCustomer(String firstName, String lastName, Order order) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.order = order;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public CloneableCustomer clone() throws CloneNotSupportedException{
        return (CloneableCustomer) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CloneableCustomer)) return false;
        CloneableCustomer that = (CloneableCustomer) o;
        return Objects.equals(getFirstName(), that.getFirstName()) &&
                Objects.equals(getLastName(), that.getLastName()) &&
                Objects.equals(getOrder(), that.getOrder());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getFirstName(), getLastName(), getOrder());
    }
}
