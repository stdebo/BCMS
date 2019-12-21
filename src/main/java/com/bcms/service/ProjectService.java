package com.bcms.service;

import com.bcms.bean.Project;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ProjectService {

    List<Project> getAllProject();

    @CacheEvict(value = "project" ,allEntries = true,key="'delete:'+#guid")
    void delete(String guid);
}
