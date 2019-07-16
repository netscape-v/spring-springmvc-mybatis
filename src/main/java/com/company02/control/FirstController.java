package com.company02.control;

import com.company02.entity.Role;
import com.company02.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
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
        //System.out.println(list);
        return list;
    }

    @RequestMapping("add")
    public String addRole(MultipartFile files,Role role){
        if(!files.isEmpty()){
            //设置文件的保存路径
            String filePath ="D:\\Framework_learn\\SSM-quadratic\\target\\SSM-quadratic\\UploadImage\\"+files.getOriginalFilename();
            //设置文件路径名,D:\Framework_learn\SSM-quadratic\target\SSM-quadratic\UploadImage
            //UploadImage/2860a7ffc8bf2ad22d4f4b2d1aac59c5.jpeg
            String fileName ="UploadImage/"+files.getOriginalFilename();
            role.setImage(fileName);
            //转存文件
            try {
                files.transferTo(new File(filePath));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Integer i = service.addRole(role);
        System.out.println("成功加入"+i+"条");
        return "redirect:/index.html";
    }
}
