package com.Harsha.PersonalLoanApplication;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("CreditData")
public class CerditScoreData implements JavaDelegate{

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		String Aadaarnum=(String) execution.getVariable("AadharVerification");
		String Pannum=(String) execution.getVariable("PANNumber");
		
		if((Aadaarnum.equals("1000"))&&(Pannum.equals("Asyph01"))) {
		execution.setVariable("CreditScore",800);
		}else if((Aadaarnum.equals("1001"))&&(Pannum.equals("Asyph02"))) {
			execution.setVariable("CreditScore",700);
			}
		
	}

}
