package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.InvalidResultSetAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.techelevator.projects.model.Project;

public class JdbcProjectDao implements ProjectDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcProjectDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public Project getProject(int projectId) {
		Project resultantProject = null;
		try {
			String sqlGetProject = "select * from project where project_id = ?";
			SqlRowSet result = jdbcTemplate.queryForRowSet(sqlGetProject,projectId);
			if (result.next()) {
				resultantProject = mapRowToProject(result);
			}
			return resultantProject;
		} catch (ArrayIndexOutOfBoundsException e) {
			return null;
		}
	}

	@Override
	public List<Project> getAllProjects() {
		List<Project> allProjects = new ArrayList<>();
		String sqlGetAllProjects = "select * from project";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sqlGetAllProjects);
		while (result.next()) {
			Project resultantProject = mapRowToProject(result);
			allProjects.add(resultantProject);
		}
		return allProjects;
	}

	@Override
	public Project createProject(Project newProject) {
		String sqlAddEmployeeToProject = "insert into project(project_id,name,from_date,to_date) values (?,?,?,?)";
		jdbcTemplate.update(sqlAddEmployeeToProject,newProject.getId(),newProject.getName(),newProject.getFromDate(),newProject.getToDate());
		return newProject;
	}

	@Override
	public void deleteProject(int projectId) {
		String sqlRemoveProjectFromEmployeeProject = "delete from project_employee where project_id = ?";
		jdbcTemplate.update(sqlRemoveProjectFromEmployeeProject,projectId);
		String sqlRemoveProjectFromProject = "delete from project where project_id = ?\n";
		jdbcTemplate.update(sqlRemoveProjectFromProject,projectId);

	}

	private Project mapRowToProject(SqlRowSet results) {
		Project project = new Project();
		try {
			project.setId(results.getInt("project_id"));
			project.setName(results.getString("name"));
			project.setFromDate(results.getDate("from_date").toLocalDate());
			project.setToDate(results.getDate("to_date").toLocalDate());
		} catch (NullPointerException E){}
		return project;
	}
}
