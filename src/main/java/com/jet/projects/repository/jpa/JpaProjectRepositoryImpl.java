package com.jet.projects.repository.jpa;

import com.jet.projects.model.Project;
import com.jet.projects.repository.ProjectRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by b.istomin on 26.03.2016.
 */
@Repository
@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class JpaProjectRepositoryImpl implements ProjectRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public Project save(Project project) {
        if (project.isNew()) {
            em.persist(project);
        } else {
            em.merge(project);
        }
        return project;
    }

    @Override
    @Transactional
    public boolean delete(int id) {
        return em.createNamedQuery(Project.DELETE).setParameter("id", id).executeUpdate() != 0;
    }

    @Override
    public Project get(int id) {
        return em.find(Project.class, id);
    }

    @Override
    public List<Project> getAll() {
        return em.createNamedQuery(Project.ALL_SORTED, Project.class).getResultList();
    }
}
