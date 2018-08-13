package com.routechain.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	 //조회
    @GetMapping(path="/product/" )
    public String getProducts() {

        return "index";
    }
}
