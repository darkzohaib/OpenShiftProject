package org.mycompany.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetEmployeeByName {

	@JsonProperty("GetEmployeeByNameRequest")
	private GetEmployeeByNameRequest GetEmployeeByNameRequest;
	
	@JsonProperty("GetEmployeeByNameResponse")
	private GetEmployeeByNameResponse GetEmployeeByNameResponse;

	@JsonProperty("GetEmployeeByNameRequest")
	public GetEmployeeByNameRequest getGetEmployeeByNameRequest() {
		return GetEmployeeByNameRequest;
	}

	@JsonProperty("GetEmployeeByNameRequest")
	public void setGetEmployeeByNameRequest(GetEmployeeByNameRequest getEmployeeByNameRequest) {
		GetEmployeeByNameRequest = getEmployeeByNameRequest;
	}

	@JsonProperty("GetEmployeeByNameResponse")
	public GetEmployeeByNameResponse getGetEmployeeByNameResponse() {
		return GetEmployeeByNameResponse;
	}

	@JsonProperty("GetEmployeeByNameResponse")
	public void setGetEmployeeByNameResponse(GetEmployeeByNameResponse getEmployeeByNameResponse) {
		GetEmployeeByNameResponse = getEmployeeByNameResponse;
	}

	@Override
	public String toString() {
		return "GetEmployeeByName [GetEmployeeByNameRequest=" + GetEmployeeByNameRequest
				+ ", GetEmployeeByNameResponse=" + GetEmployeeByNameResponse + "]";
	}
	
	
	
}
