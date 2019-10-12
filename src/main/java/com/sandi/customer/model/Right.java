package com.sandi.customer.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Table(name = "rights")
public class Right {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "right_id", nullable = false, updatable = false)
    private Integer id;
    private String name;

}