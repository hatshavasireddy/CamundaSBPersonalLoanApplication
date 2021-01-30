package com.Harsha.PersonalLoanApplication;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("DocValidation")
public class DocumentValidation implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		String Aadaarnum=(String) execution.getVariable("AadharVerification");
		String Pannum=(String) execution.getVariable("PANNumber");
		
		if((Aadaarnum.equals("1000"))&&(Pannum.equals("Asyph01"))) {
			execution.setVariable("Approve","valid");
		}else if((Aadaarnum.equals("1001"))&&(Pannum.equals("Asyph02"))) {
			execution.setVariable("Approve","valid");
		}else {
			execution.setVariable("Approve","invalid");
		}
	}

}
