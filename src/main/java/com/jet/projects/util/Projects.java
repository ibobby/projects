package com.jet.projects.util;

import com.jet.projects.model.Project;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by b.istomin on 27.03.2016.
 */

@XmlRootElement(name = "Projects")
public class Projects {
    public List<Project> projects;

    /**
     * element that is going to be marshaled in the xml
     */
    @XmlElement(name = "Project")
    public void setCountries(List<Project> projects) {
        this.projects = projects;
    }
}