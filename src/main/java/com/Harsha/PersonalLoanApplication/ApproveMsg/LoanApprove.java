package com.Harsha.PersonalLoanApplication.ApproveMsg;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("ApproveMsg")
public class LoanApprove implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		System.out.println("Loan Approved please check your bank statement");
		System.out.println("Loan Amount : "+execution.getVariable("LoanAmount"));
	}

}
