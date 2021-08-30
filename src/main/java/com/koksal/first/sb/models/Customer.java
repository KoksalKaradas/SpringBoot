package com.koksal.first.sb.models;

import javax.persistence.*;

@Entity
@Table(name="CUSTOMER")
public class Customer {

    @Id
    @Column(name="CUSTOMER_NUM")
    private Long customerNum;

    @Column(name="NAME")
    private String name;
    @Column(name="SURNAME")
    private String surname;
    @Column(name="CITY")
    private String city;
    @Column(name="DISTRICT")
    private String district;

    public Long getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(Long customerNum) {
        this.customerNum = customerNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

}
