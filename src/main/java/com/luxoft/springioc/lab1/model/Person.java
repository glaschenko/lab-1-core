package com.luxoft.springioc.lab1.model;

public interface Person {
    public void setName(String name);
    public String getName ();
    public void sayHello(Person person);


    Country getCountry();

    void setCountry(Country country);
}