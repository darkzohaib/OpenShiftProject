package org.mycompany.model;

public class GetEmployeeByNameResponse {

	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "GetEmployeeByNameResponse [employee=" + employee + "]";
	}
	
	
	
}
