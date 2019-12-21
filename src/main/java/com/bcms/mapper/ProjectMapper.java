package com.bcms.mapper;

import com.bcms.bean.Project;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProjectMapper {

    List<Project> getAllProject();

}
