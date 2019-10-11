package com.sandi.customer.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "customer_name")
    private String customerName;
    @Column(name = "password")
    private String password;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "country")
    private String country;
    @Column(name = "created_on")
    private String createdOn;
    @Column(name = "updated_on")
    private String updatedOn;
    @Column(name = "last_login")
    private String lastLogin;

}
