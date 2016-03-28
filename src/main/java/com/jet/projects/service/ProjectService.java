package com.jet.projects.service;

import com.jet.projects.model.Project;
import com.jet.projects.util.exception.NotFoundException;

import java.util.List;

/**
 * Created by b.istomin on 15.05.2015.
 */
public interface ProjectService {

    public Project save(Project project) throws NotFoundException;

    public void delete(int id) throws NotFoundException;

    public Project get(int id) throws NotFoundException;

    public List<Project> getAll();

    public void update(Project project) throws NotFoundException;

}
