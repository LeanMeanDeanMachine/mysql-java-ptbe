package projects;

import projects.dao.ProjectDao;
import projects.entity.Project;

public class ProjectService {
    private ProjectDao projectDao;

    public ProjectService() {
        projectDao = new ProjectDao();
    }

    public Project addProject(Project project) {
        return projectDao.insertProject(project);
    }
}
