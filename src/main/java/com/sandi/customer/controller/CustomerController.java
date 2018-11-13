package com.sandi.customer.controller;

import com.sandi.customer.model.Customer;
import com.sandi.customer.repository.CustomerRepository;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
public class CustomerController {

    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }

    @GetMapping("/get")
    @ApiOperation(value = "Get All Customers")
    @ApiResponse(code = 400, message = "Bad Request")
    public ResponseEntity getCustomerInfo(){
        return ResponseEntity.status(HttpStatus.OK).body(customerRepository.findAll());
    }

    @PostMapping("/save")
    @ApiOperation(value = "Save Customer")
    @ApiResponse(code = 400, message = "Bad Request")
    public ResponseEntity saveCustomerInfo(@NotNull @RequestBody Customer customer){
        return ResponseEntity.status(HttpStatus.OK).body(customerRepository.save(customer));
    }

}
