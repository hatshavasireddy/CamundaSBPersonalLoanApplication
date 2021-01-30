package com.Harsha.PersonalLoanApplication;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("LoginCheck")
public class LoginValidation implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		String uName=(String) execution.getVariable("name");
		String password=(String) execution.getVariable("password");
		
		if((uName.equals("demo"))&&(password.equals("demo"))) {
			execution.setVariable("Approved","Success");
		
	}
		else if((uName.equals("Harsha"))&&(password.equals("Harsha"))) {
			execution.setVariable("Approved","Success");
		}
		
		else {
			System.out.println("inValid Login");
			execution.setVariable("Approved","Failed");
		}
		
	}

}
