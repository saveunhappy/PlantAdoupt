package com.course.business.controller;

import com.course.server.domain.Test;
import com.course.server.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {
    @Resource
    private TestService testService;
    @RequestMapping("/test")
    public List<Test> test(){
        List<Test> list = testService.list();
        return list;
    }
}