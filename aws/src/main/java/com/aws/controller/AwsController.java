package com.aws.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/aws")
public class AwsController {


    @GetMapping("/welcome")
    public String getMethod(){
        return "wel come to aws";
    }

    @GetMapping("/get/{id}")
    public String getemployee(@PathVariable int id){
        return "employee";
    }

    @GetMapping("/get")
    public String getwithrequest(@RequestParam int id){
        return "employee get by using requst param";
    }



}
