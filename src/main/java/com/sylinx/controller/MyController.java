package com.sylinx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class MyController {

    @Autowired
    private Mydata myValue;

    @GetMapping("/mytime")
    public String test1(Model model) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        model.addAttribute("myvalue", "(" + myValue.getValue() + ")" + sdf.format(new Date()));
        return "index";
    }
}
