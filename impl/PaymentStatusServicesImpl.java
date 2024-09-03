package com.cpt.payments.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cpt.payments.constant.TransactionStatusEnum;
import com.cpt.payments.dto.TransactionDTO;
import com.cpt.payments.pojo.Transaction;
import com.cpt.payments.services.factory.PaymentStatusFactory;
import com.cpt.payments.services.impl.handler.CreatedStatusHandler;
import com.cpt.payments.services.interfaces.PaymentStatusService;
import com.cpt.payments.services.interfaces.PaymentStatusHandler;
import com.cpt.payments.services.interfaces.PaymentStatusService;


@Component
public class PaymentStatusServicesImpl implements PaymentStatusService {

	@Autowired
	 PaymentStatusFactory StatusFactory;
	@Override
	public  String TransactionDTO(TransactionDTO payment) {
		// TODO Auto-generated method stub
		System.out.println("PaymentStatusServicesImpl.processPaymentStatus()"
				+"payment:"+payment);
		

		
		TransactionStatusEnum statusEnum=TransactionStatusEnum.getByName(payment.getTxnStatus());
		System.out.println("enum id:"+statusEnum.getId()+""
				+"|name:"+statusEnum.getName());
		statusEnum.getName();
		
		
	
		PaymentStatusHandler statusHandler=StatusFactory.getStatusHandler(statusEnum);
		
//		String processStatusResponse = statusHandler.processStatus(payment);
		
		
		
		return"Returning from service||";
	}
	@Override
	public TransactionDTO processStatus(TransactionDTO payment) {
		// TODO Auto-generated method stub
		return null;
	}

}
