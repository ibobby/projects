package com.jet.projects.service;

import com.jet.projects.model.Project;
import com.jet.projects.repository.ProjectRepository;
import com.jet.projects.util.exception.ExceptionUtil;
import com.jet.projects.util.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by b.istomin on 14.05.2015.
 */
@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository repository;

    public ProjectRepository getRepository() {
        return repository;
    }

    @Override
    public Project save(Project project) throws NotFoundException {
        return repository.save(project);
    }

    @Override
    public void delete(int id) throws NotFoundException {
        ExceptionUtil.check(repository.delete(id), id);
    }

    @Override
    public Project get(int id) throws NotFoundException {
        return ExceptionUtil.check(repository.get(id), id);
    }

    @Override
    public List<Project> getAll() {
        return repository.getAll();
    }

    @Override
    public void update(Project project) throws NotFoundException {
        ExceptionUtil.check(repository.save(project), project.getId());
    }
}
