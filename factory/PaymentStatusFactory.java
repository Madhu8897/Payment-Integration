package com.cpt.payments.services.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.cpt.payments.services.impl.handler.CreatedStatusHandler;
import com.cpt.payments.services.interfaces.PaymentStatusHandler;


@Component

public class PaymentStatusFactory {

    private static final int CREATED = 1;





	private static final int INITIATE = 0;


	
    
    
	@Autowired
    private ApplicationContext ctx;
	
    public PaymentStatusHandler getStatusHandler(int status) {
    	
    switch(status) {
//    if(status== CREATED) { 
    	case CREATED:
    System.out.println("Creating CreatedStatusHandler for "
    		+"status: " + status);
    CreatedStatusHandler CreatedStatusHandler=ctx.getBean(CreatedStatusHandler.class);
    System.out.println("Got bean from Applicationcontext|| "
    + "CreatedStatusHandler:" +CreatedStatusHandler);
    return  CreatedStatusHandler;
    	case INITIATE:
    		return null;
    default:
    System.out.println("Unable to find handler");
     return null;
    
    }}
}
