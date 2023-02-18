package com.amininjast.mysecondspringproject.customer;

import com.amininjast.mysecondspringproject.MysecondspringprojectApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @GetMapping("/")
    Customer getCustomer(){
        return new Customer(1L,"amin injast");
    }

}
