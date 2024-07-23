package com.dj.mini_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/posts")
public class PostController {

    @GetMapping
    public String get(){
        return "pages/postsPage";
    }
}
