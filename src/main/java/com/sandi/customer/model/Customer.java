package com.sandi.customer.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "customermaster")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "customer_name")
    private String name;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "email")
    private String email;
    @Column(name = "country")
    private String country;

}
