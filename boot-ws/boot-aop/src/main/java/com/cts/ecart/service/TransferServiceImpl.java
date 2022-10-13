package com.cts.ecart.service;

import org.springframework.stereotype.Service;

@Service
public class TransferServiceImpl {

	public String fundsTransfer() {

		System.out.println(">>> fundstranfer process is initiated ");

		return "transaction with ID TX0380374 is completed successfully";
	}

	public String rewardTransfer() {

		System.out.println(">>> reward process is initiated ");

		return "transaction with ID TXO934793 is completed successfully";
	}

}
