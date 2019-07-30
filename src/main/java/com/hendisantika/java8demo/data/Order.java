package com.hendisantika.java8demo.data;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Project : java8-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-07-31
 * Time: 05:36
 */
public class Order implements Serializable {

    private String orderNumber;
    private double orderAmount;
    private String orderStatus;

    //Copy Constructor
    public Order(Order order){
        this(order.getOrderNumber(),order.getOrderAmount(),order.getOrderStatus());
    }

    public Order(String orderNumber, double orderAmount, String orderStatus) {
        this.orderNumber = orderNumber;
        this.orderAmount = orderAmount;
        this.orderStatus = orderStatus;
    }

    @Override
    public Order clone(){
        try {
            return (Order) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Order(this.orderNumber,this.orderAmount,this.orderStatus);
        }
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public double getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
}