package com.jet.projects.model;

import com.jet.projects.util.TimeUtil;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by b.istomin on 26.03.2016.
 */
@Entity
@Table(name = "projects")
@NamedQueries({
        @NamedQuery(name = "Project.DELETE", query = "DELETE FROM Project p WHERE p.id=:id"),
        @NamedQuery(name = "Project.ALL_SORTED", query = "SELECT p FROM Project p ORDER BY p.id asc"),

})
@XmlRootElement(name = "Projects")
public class Project extends BaseEntity {

    public static final String ALL_SORTED = "Project.ALL_SORTED";    
    public static final String DELETE = "Project.DELETE";    

    @Column(name = "name", nullable = false)
    @NotEmpty
    protected String name;

    @Column(name = "description", nullable = false)
    @NotEmpty
    protected String description;

    @Column(name = "modified", columnDefinition = "timestamp default now()")
    protected Date modified = new Date();

    @Column(name = "manager", nullable = false)
    @NotEmpty
    protected String manager;

    public Project() {
    }

    public Project(String name, String description, String manager) {
        this.name = name;
        this.description = description;
        this.manager = manager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "project{" +
                "id=" + id +
                ", name=" + name +
                ", description='" + description + '\'' +
                ", manager=" + manager +
                '}';
    }
}
