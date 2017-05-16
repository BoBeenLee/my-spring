package io.bobinlee.api;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/helllo")
    public String hello() {
        return "hello";
    }
}
