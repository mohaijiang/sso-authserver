package com.mohaijiang.cloud.authserver;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author mohaijiang on 10/9/17
 */
@Controller
public class HelloController {

    @GetMapping(value = "/hello")
    public String hello(){

        return "hello";
    }
}
