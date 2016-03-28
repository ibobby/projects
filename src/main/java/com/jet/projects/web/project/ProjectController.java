package com.jet.projects.web.project;

import com.jet.projects.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by b.istomin on 26.02.2016.
 */
@Controller
public class ProjectController {

    @Autowired
    private ProjectService service;

    @RequestMapping(value = "/projects", method = RequestMethod.GET)
    public String projectList(Model model) {
        model.addAttribute("projectList", service.getAll());
        return "projectList";
    }

}
