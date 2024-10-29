package org.mycompany.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.mycompany.model.GetEmployeeByName;
import org.springframework.stereotype.Component;



@Component
public class RestRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		
		restConfiguration()
			.bindingMode(RestBindingMode.json);
		
		
		rest("/api/employee/v1")
			.post("/getemployeeDetails")
			.type(GetEmployeeByName.class)
            .consumes("application/json")
            .produces("application/json")
            .to("direct:GetEmployeeByNameService");
		
		from("direct:GetEmployeeByNameService")
		     .log("${body}")
			.to("bean:employeeService?method=setEmployeeByNameReq")
			.to("bean:employeeService?method=getEmployeeByName")
			.log("haha:)");
			
		
	}

}
