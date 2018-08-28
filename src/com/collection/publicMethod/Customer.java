package com.collection.publicMethod;

/**
 * Created by jibingbing on 2017/12/27.
 */
public class Customer implements Comparable {
    private String name;
    private int age;

    public Customer(String name,int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Customer other = (Customer)o;

        if(this.name.compareTo(other.name) > 0) return 1;
        if(this.name.compareTo(other.name) < 0) return -1;

        if(this.age > other.age) return 1;
        if(this.age < other.age) return -1;
        return 0;
    }

    public boolean equals(Object o){
        if(this == o) return true;

        if(!(o instanceof Customer)) return false;

        final Customer other = (Customer) o;
        if(this.name.equals(other.name) && this.age == other.age) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode(){
        int result;
        result = (name == null ? 0 : name.hashCode());
        result = 29 * result + age;
        return result;
    }

    public String toString (){
        return "name = " + this.name + " ,age = " + this.age;
    }
}
