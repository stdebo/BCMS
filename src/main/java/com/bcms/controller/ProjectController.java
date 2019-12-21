package com.bcms.controller;

import com.bcms.bean.Project;
import com.bcms.service.ProjectService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class ProjectController {

    @Autowired
    ProjectService projectService;

    //查询所有学生
    @RequestMapping("project/all")
    public @ResponseBody
    Map<String,Object> allProject(int page, int limit){

        int count = projectService.getAllProject().size();
        PageHelper.startPage(page,limit);
        List<Project> projectList1 = projectService.getAllProject();
        PageInfo<Project> projectPageInfo = new PageInfo<>(projectList1);

        List<Project> projectList = projectPageInfo.getList();

        Map<String,Object> resultMap = new HashMap<String,Object>();
        resultMap.put("code",0);
        resultMap.put("msg","");
        resultMap.put("count",count);


        resultMap.put("data",projectList);
        return resultMap;

    }

}
