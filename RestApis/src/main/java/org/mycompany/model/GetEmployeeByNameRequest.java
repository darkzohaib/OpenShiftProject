package org.mycompany.model;

public class GetEmployeeByNameRequest {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "GetEmployeeByNameRequest [name=" + name + "]";
	}
	
	
}
