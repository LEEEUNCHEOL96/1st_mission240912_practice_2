package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/article")
@Controller
public class ArticleController {


    @GetMapping("/list")
    public String articleList(){
        return "article_list";
    }
}
