package com.example.jspdemo.controller;

import com.example.jspdemo.entity.SayHello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/jsp")
public class JspController {
    @RequestMapping("/hello")
    public ModelAndView jspview(){
        //Map<String,String> map=new HashMap<>();
        ModelAndView mav=new ModelAndView();
        mav.addObject("msg","hello,jsp!");
        mav.setViewName("index");
        return mav;
    }

    @Resource
    private SayHello sayHello;

    public SayHello getSayHello() {
        return sayHello;
    }

    public void setSayHello(SayHello sayHello) {
        this.sayHello = sayHello;
    }

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(){
        return sayHello.getWho();
    }

}
