package com.techelevator.projects.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.techelevator.projects.model.Department;
import org.springframework.jdbc.core.JdbcTemplate;

import com.techelevator.projects.model.Employee;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class JdbcEmployeeDao implements EmployeeDao {

	private final JdbcTemplate jdbcTemplate;

	public JdbcEmployeeDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> allEmployees = new ArrayList<>();
		String sqlGetEmployeesWithoutProject = "select * from employee e\n";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sqlGetEmployeesWithoutProject);
		System.out.print(result.toString());
		while (result.next()) {
			Employee resultantEmployee = mapRowToDepartment(result);
			allEmployees.add(resultantEmployee);
		}
		return allEmployees;
	}

	@Override
	public List<Employee> searchEmployeesByName(String firstNameSearch, String lastNameSearch) {
		List<Employee> employeesWithoutProject = new ArrayList<>();
		String sqlGetEmployeesWithoutProject = "select e.employee_id, e.department_id, e.first_name, e.last_name, e.hire_date, e.birth_date  \n" +
				"from employee e\n" +
				"where e.first_name like ? and e.last_name like ?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sqlGetEmployeesWithoutProject, "%" +firstNameSearch + "%","%" + lastNameSearch + "%");
		while (result.next()) {
			Employee resultantEmployee = mapRowToDepartment(result);
			employeesWithoutProject.add(resultantEmployee);
		}
		return employeesWithoutProject;
	}

	@Override
	public List<Employee> getEmployeesByProjectId(int projectId) {
		List<Employee> employeesOfProjectID = new ArrayList<>();
		String sqlGetEmployeesWithoutProject = "select e.employee_id, e.department_id, e.first_name, e.last_name, e.hire_date, e.birth_date  \n" +
				"from employee e\n" +
				"join project_employee pe on e.employee_id = pe.employee_id\n"+
				"where pe.project_id = ?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sqlGetEmployeesWithoutProject, projectId);
		while (result.next()) {
			Employee resultantEmployee = mapRowToDepartment(result);
			employeesOfProjectID.add(resultantEmployee);
		}
		return employeesOfProjectID;
	}

	@Override
	public void addEmployeeToProject(int projectId, int employeeId) {
		String sqlAddEmployeeToProject = "insert into project_employee (project_id,employee_id) values (?,?)\n";
		jdbcTemplate.update(sqlAddEmployeeToProject,projectId,employeeId);
	}

	@Override
	public void removeEmployeeFromProject(int projectId, int employeeId) {
		String sqlRemoveEmployeeFromProject = "delete from project_employee where project_id = ? and employee_id = ?";
		jdbcTemplate.update(sqlRemoveEmployeeFromProject,projectId,employeeId);
	}

	@Override
	public List<Employee> getEmployeesWithoutProjects() {
		List<Employee> employeesWithoutProject = new ArrayList<>();
		String sqlGetEmployeesWithoutProject = "select e.employee_id, e.department_id, e.first_name, e.last_name, e.hire_date, e.birth_date  \n" +
				"from employee e\n" +
				"where e.employee_id not in (select employee_id from public.project_employee);\n";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sqlGetEmployeesWithoutProject);
		while (result.next()) {
			Employee resultantEmployee = mapRowToDepartment(result);
			employeesWithoutProject.add(resultantEmployee);
		}
		return employeesWithoutProject;
	}

	private Employee mapRowToDepartment(SqlRowSet results) {
		Employee employee = new Employee();
		employee.setId(results.getInt("employee_id"));
		employee.setDepartmentId(results.getInt("department_id"));
		employee.setFirstName(results.getString("first_name"));
		employee.setLastName(results.getString("last_name"));
		employee.setBirthDate(results.getDate("birth_date").toLocalDate());
		employee.setHireDate(results.getDate("hire_date").toLocalDate());
		return employee;
	}


}
