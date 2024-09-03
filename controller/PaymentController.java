package com.cpt.payments.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpt.payments.constant.EndPoints;
import com.cpt.payments.dto.TransactionDTO;
import com.cpt.payments.pojo.CreateTransactionRes;

import com.cpt.payments.pojo.Transaction;
import com.cpt.payments.services.factory.PaymentStatusFactory;
import com.cpt.payments.services.interfaces.PaymentStatusService;
import com.cpt.payments.services.interfaces.PaymentStatusHandler;



@RestController  
@RequestMapping(EndPoints.V1_PAYMENTS)
public class PaymentController {
	
	
	private ModelMapper modelMapper;
	
	
	private PaymentStatusService service;
	
	public PaymentController(ModelMapper modelMapper, PaymentStatusService paymentService) {
		this.modelMapper = modelMapper;
		this.service = paymentService;
		
	}

	
	@PostMapping(value= {EndPoints.EMPTY_STRING,EndPoints.SLASH})
public ResponseEntity<CreateTransactionRes> createPayment( @RequestBody Transaction transaction) {
		System.out.println("*** Starting payment processing|transaction:"+transaction);
	
	TransactionDTO	txnDTO =modelMapper.map(transaction,TransactionDTO.class);
		
		System.out.println("Transaction object after conversion"+"txnDTO:"+txnDTO);
TransactionDTO returnObject = service.processStatus(txnDTO);
    	
		System.out.println("PaymentController.createPayment() returning response:"
    			+ "|valFromService:" + returnObject);
        
		CreateTransactionRes response = new CreateTransactionRes();
		response.setId(returnObject.getId());
		response.setTxnStatus(returnObject.getTxnStatus());
		
		System.out.println("Returning response:" + response);

		ResponseEntity<CreateTransactionRes> responseEntity = new ResponseEntity<>(
				response, HttpStatus.CREATED);
		
		System.out.println("responseEntity:" + responseEntity);
		
		return responseEntity;
    }
	@PostMapping(EndPoints.PAYMENT_INITIATE)
	public ResponseEntity<String> initiatePayment( @RequestBody Transaction transaction) {
System.out.println("PaymentController.initiatePayment()|||INVOKED");

     return new ResponseEntity<>("From Controller",HttpStatus.OK);

}

}





