package com.example.dockertest.controller;



import com.example.dockertest.entity.Visitor;
import com.example.dockertest.mapper.VisitorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class VisitorController {

    @Autowired
    private VisitorMapper visitorMapper;

    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        String ip=request.getRemoteAddr();
        Visitor visitor = visitorMapper.getOne(ip);

        if(visitor==null){
            visitor=new Visitor();
            visitor.setIp(ip);
            visitor.setTimes(1);
            visitorMapper.insert(visitor);
        }else {
            visitor.setTimes(visitor.getTimes()+1);
            visitorMapper.update(visitor);
        }

        return "I have been seen ip "+visitor.getIp()+" "+visitor.getTimes()+" times.";
    }
}
