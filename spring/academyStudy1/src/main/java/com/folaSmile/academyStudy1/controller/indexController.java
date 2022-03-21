package com.folaSmile.academyStudy1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class indexController {

    // value="/톰캣 루트 아래의 주소" ,
    // value="/" 으로 설정하면 루트로 읽는다
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home() {
        System.out.println("index controller start");


        // .jsp 파일 이름을 리턴
        return "index";
    }



}
