package com.reviewspring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String post(){
        return "testing";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String postName(@PathVariable int id){
        return "test";
    }
}
