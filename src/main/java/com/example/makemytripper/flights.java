package com.example.makemytripper;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flights {
    @GetMapping("/flights")
    public String getData() {return  "Please book your flight from Indigo testing dta" +
            " kindly book ticket for New Delhi to anywhere at anytime at 10% discounted price1" ; }
}