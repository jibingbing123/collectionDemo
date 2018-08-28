package com.collection.publicMethod;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by jibingbing on 2017/12/27.
 */
public class SetCustomer {
    public static void main(String[] args) {
        Set<Customer> customers = new TreeSet<>();
        Customer customer1 = new Customer("ji",22);
        Customer customer2 = new Customer("liu",21);
        customers.add(customer1);
        customers.add(customer2);


        for(Customer customer : customers){
            System.out.println(customer);
        }
    }
}
