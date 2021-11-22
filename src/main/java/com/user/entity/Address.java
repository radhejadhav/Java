package com.user.entity;

public class Address {

    private long id;
    private String city;
    private String street;

    public Address(long id, String city, String street) {
        this.id = id;
        this.city = city;
        this.street = street;
    }

    public long getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }
}
