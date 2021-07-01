package com.reviewspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {
    @GetMapping("/add/{a}/and/{b}")
    @ResponseBody
    public int add(@PathVariable int a, @PathVariable int b){
        return (a+b);
    }

    @GetMapping("/subtract")
    @ResponseBody
    public int subtract(){
        int a = 10;
        int b = 6;
        return (a-b);
    }

    @GetMapping("/multiply")
    @ResponseBody
    public int multiply(){
        int a=4;
        int b=5;
        return (a*b);
    }

    @GetMapping("/divide")
    @ResponseBody
    public int divide(){
        int a=6;
        int b=3;
        return (a/b);
    }

}
