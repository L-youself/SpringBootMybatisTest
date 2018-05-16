package cn.wwd.goahead.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {
@RequestMapping("/hello")
 public String hello(){

    String a="123";
     return "hellWord123";
 }
}

