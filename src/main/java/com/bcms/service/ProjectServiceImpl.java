package com.bcms.service;

import com.bcms.bean.Project;
import com.bcms.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectMapper projetMapper;

    //查找所有项目
    @Override
    public List<Project> getAllProject() {
        List<Project> projectList = projetMapper.getAllProject();
        return projectList;
    }

    @Override
    public void delete(String guid) {

    }
}
