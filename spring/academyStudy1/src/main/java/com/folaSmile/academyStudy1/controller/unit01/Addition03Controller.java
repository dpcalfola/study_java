package com.folaSmile.academyStudy1.controller.unit01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class Addition03Controller {


    @RequestMapping(value = "/add03", method = RequestMethod.GET)
    public String home() {
        System.out.println("Add03 controller start");


        // .jsp 파일 이름을 리턴
        return "addition03";
    }

}
