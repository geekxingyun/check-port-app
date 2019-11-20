package com.xingyun.springbootwithcheckportsample.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qing-feng.zhao
 * @description
 * @date 11/19/2019 1:48 PM
 */
@RestController
public class HomeController {

    @GetMapping(value = "/")
    public String home(){
       return "Hello Wold";
    }
}
