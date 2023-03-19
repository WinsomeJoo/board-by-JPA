package com.study.board.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

    // GetMapping으로 맵핑된 url주소로 들어 갔을 때 @ResponseBody에 의해 "helllo world"가 반환됨
    @GetMapping("/")
    @ResponseBody
    public String main(){
        return "hello world";
    }
}
