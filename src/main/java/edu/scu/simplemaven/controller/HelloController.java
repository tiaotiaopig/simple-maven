package edu.scu.simplemaven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lifeng
 * @date 2022/8/24 21:19
 */

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/say")
    public String sayHello() {
        return "Hello Jenkins!";
    }
}
