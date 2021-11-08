package org.coep.recruitment.portal.ui.model.response;

public class OperationStatusModel {
		
	private String operationResult;
	private String operationName;

	public OperationStatusModel() {
		super();
	}

	public OperationStatusModel(String operationResult, String operationName) {
		super();
		this.operationResult = operationResult;
		this.operationName = operationName;
	}
	
	public String getOperationResult() {
		return operationResult;
	}
	public void setOperationResult(String operationResult) {
		this.operationResult = operationResult;
	}
	public String getOperationName() {
		return operationName;
	}
	public void setOperationName(String operationName) {
		this.operationName = operationName;
	}
}
