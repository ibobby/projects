package com.jet.projects.repository;

import com.jet.projects.model.Project;

import java.util.List;

/**
 * Created by b.istomin on 26.03.2016.
 */
public interface ProjectRepository {

    Project save(Project project);

    boolean delete(int id);

    Project get(int id);

    List<Project> getAll();

}
