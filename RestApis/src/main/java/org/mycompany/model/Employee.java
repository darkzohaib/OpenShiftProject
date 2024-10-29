package org.mycompany.model;

public class Employee {
	
	private int id;
	
	private String name;
	
	private String projectName;
	
	private String empCode;
	
	private String manager;
	
	
	

	public Employee(int id, String name, String projectName, String empCode, String manager) {
		super();
		this.id = id;
		this.name = name;
		this.projectName = projectName;
		this.empCode = empCode;
		this.manager = manager;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", projectName=" + projectName + ", empCode=" + empCode
				+ ", manager=" + manager + "]";
	}
	
	
	
}
