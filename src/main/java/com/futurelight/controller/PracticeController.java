package com.futurelight.controller;

import com.futurelight.config.CustomPractice;
import com.futurelight.poio.ContactInfo;
import com.futurelight.service.ContactService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/colunt")
public class PracticeController {

    @Autowired
    private ContactService contactService;

    @RequestMapping("/string")
    @ResponseBody
    public PageInfo<ContactInfo> query(){
        PageInfo<ContactInfo> query = contactService.query();
        return query;
    }
}
