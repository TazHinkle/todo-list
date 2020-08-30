package dev.tazcan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    int visits = 0;
    // http://localhost:8080/todo-list/hello
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        visits++;
        return "visits " + visits;
    }

    // http://localhost:8080/todo-list/welcome
    @GetMapping("welcome")
    public String welcome() {
        return "welcome";
    }
}
