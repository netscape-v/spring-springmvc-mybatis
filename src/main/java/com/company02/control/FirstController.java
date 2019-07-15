package com.company02.control;

import com.company02.entity.Role;
import com.company02.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/role")
public class FirstController {
    @Autowired
    private RoleService service;

    @RequestMapping("/list")
    @ResponseBody
    public List<Role> RoleList(){
        List<Role> list = service.findAll();
        System.out.println(list);
        return list;
    }
}
