package com.example.makemytripper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class taxi {
    @GetMapping("/taxi")
    public String getData() {return  "Please book your bus from Indigo testing dta" +
            " kindly book ticket for New Delhi to anywhere at 10% discounted price1" ; }
}