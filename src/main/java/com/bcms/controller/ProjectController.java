package com.bcms.controller;

import com.bcms.bean.Project;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class ProjectController {

    //查询所有学生
    @RequestMapping("project/all")
    public @ResponseBody
    Map<String,Object> allProject(int page, int limit){
        /*
        int count = studentService.getAllStudent().size();
        PageHelper.startPage(page,limit);
        List<Student> studentList1 = studentService.getAllStudent();

        PageInfo<Student> studentPageInfo = new PageInfo<>(studentList1);

        List<Student> studentList = studentPageInfo.getList();
        */
        int count = 0;
        PageHelper.startPage(page,limit);
        List<Project> projectList = null;

        Map<String,Object> resultMap = new HashMap<String,Object>();
        resultMap.put("code",0);
        resultMap.put("msg","");
        resultMap.put("count",count);


        resultMap.put("data",projectList);
        return resultMap;

    }

    @RequestMapping("/toprojectlist")
    public @ResponseBody
    Map<String,Object> toprojectlist(int page, int limit){
        /*
        int count = studentService.getAllStudent().size();
        PageHelper.startPage(page,limit);
        List<Student> studentList1 = studentService.getAllStudent();

        PageInfo<Student> studentPageInfo = new PageInfo<>(studentList1);

        List<Student> studentList = studentPageInfo.getList();
        */
        int count = 0;
        PageHelper.startPage(page,limit);
        List<Project> projectList = null;

        Map<String,Object> resultMap = new HashMap<String,Object>();
        resultMap.put("code",0);
        resultMap.put("msg","");
        resultMap.put("count",count);


        resultMap.put("data",projectList);
        return resultMap;

    }
}
