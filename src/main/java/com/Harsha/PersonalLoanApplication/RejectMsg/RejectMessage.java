package com.Harsha.PersonalLoanApplication.RejectMsg;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("RejectMsg")
public class RejectMessage implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		String value=(String) execution.getVariable("Approve");
				
		if(value.equals("UCancel")) {
			System.out.println("User Cancelled the Loan Application");
		}else if(value.equals("invalid")) {
			System.out.println("Invalid Documents");
		}else if(value.equals("Reject")) {
			System.out.println("Low Credit profile, please contact Bank");
		}
		
		
//		System.out.println("         ");
//		System.out.println("Your Application is Rejected");		
	}

}
