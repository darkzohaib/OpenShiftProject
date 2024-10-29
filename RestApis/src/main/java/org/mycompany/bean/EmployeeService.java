package org.mycompany.bean;

import java.util.ArrayList;
import java.util.List;

import org.mycompany.model.Employee;
import org.mycompany.model.GetEmployeeByName;
import org.mycompany.model.GetEmployeeByNameResponse;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {

	private GetEmployeeByName oGetEmployeeByName;

	private static List<Employee> listOfEmployees = new ArrayList<Employee>();
	static {

		listOfEmployees.add(new Employee(1, "Zohaib", "ncb", "123", "Sathyan"));
		listOfEmployees.add(new Employee(2, "Mark", "ncb", "123", "Sathyan"));
		listOfEmployees.add(new Employee(3, "Smith", "ncb", "123", "Sathyan"));
		listOfEmployees.add(new Employee(4, "Rishab", "ncb", "123", "Sathyan"));
		listOfEmployees.add(new Employee(5, "Zohaib", "ncb", "123", "Sathyan"));
	}

	public GetEmployeeByName setEmployeeByNameReq(GetEmployeeByName getEmployeeByName) {
		oGetEmployeeByName = getEmployeeByName;
		return oGetEmployeeByName;
	}

	public GetEmployeeByName getEmployeeByName(GetEmployeeByName getEmployeeByName) {

	//	System.out.println(getEmployeeByName);
		GetEmployeeByName oGetEmployeeByName = new GetEmployeeByName();
		for (int i = 0; i < listOfEmployees.size(); i++) {
			if (getEmployeeByName.getGetEmployeeByNameRequest().getName().equals(listOfEmployees.get(i).getName())) {
				GetEmployeeByNameResponse oGetEmployeeByNameResponse = new GetEmployeeByNameResponse();
				oGetEmployeeByNameResponse.setEmployee(listOfEmployees.get(i));
				oGetEmployeeByName.setGetEmployeeByNameResponse(oGetEmployeeByNameResponse);
				return oGetEmployeeByName;
			}
		}
		
		

		return null;
	}
	
	public List<Employee> getAllEmployeeDetails(){
		
		return listOfEmployees;
		
	}

}
