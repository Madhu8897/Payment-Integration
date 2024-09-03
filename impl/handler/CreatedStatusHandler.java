package com.cpt.payments.services.impl.handler;

import org.springframework.stereotype.Component;

import com.cpt.payments.pojo.Transaction;
import com.cpt.payments.services.interfaces.PaymentStatusHandler;


@Component
public class CreatedStatusHandler extends PaymentStatusHandler {

	@Override
	public String processStatus(Transaction payment) {
		// TODO Auto-generated method stub
		System.out.println("CreatedStatusHandler.processStatus()"
				+"payment:"+payment);
		return "Returned from CreatedStatusHandler";
	}

}
