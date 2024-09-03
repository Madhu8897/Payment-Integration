package com.cpt.payments.services.interfaces;

import com.cpt.payments.dto.TransactionDTO;
import com.cpt.payments.pojo.Transaction;

public interface PaymentStatusService {

	public TransactionDTO processStatus(TransactionDTO payment);

	
}
