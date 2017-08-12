package com.axt.p2p.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by daniel on 12/08/2017.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(){
        return "hello, world!";
    }
}
