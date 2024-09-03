package com.cpt.payments.services.interfaces;


import com.cpt.payments.pojo.Transaction;

public abstract class PaymentStatusHandler {

	public abstract String processStatus(Transaction payment);
}
