package com.Harsha.PersonalLoanApplication;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component("IntrestRate")
public class IntrestRate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		Double Intrest;
		if(execution.getVariable("IncomeSource")=="SelfEmployed");{
			Intrest=15.00;
		}
		
		if((execution.getVariable("IncomeSource")=="PrivateEmployee")||(execution.getVariable("IncomeSource")=="GovtEmployee"));
		{
			Intrest=9.00;
		}
		
		System.out.println("Employeed Details of Fee and Charges");
		System.out.println("    ");
		System.out.println("Loan Details");
		System.out.println("Loan Amount = "+execution.getVariable("LoanAmount"));
		System.out.println("Duration = "+execution.getVariable("LoanDuration"));
		Long loanAmount =(Long) execution.getVariable("LoanAmount");
		Long loanDuration=(Long) execution.getVariable("LoanDuration");
		Double intrestAmount =(Intrest/loanDuration)*loanAmount;
		System.out.println(" Intrest amount = "+intrestAmount);
		Double TloanAmount =loanAmount+intrestAmount;
		Double EmiAmount=TloanAmount/loanDuration;
		System.out.println("Per month EMI = "+EmiAmount);
		
	}

}
