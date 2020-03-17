package com.testing.finnet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testing.finnet.client.BillerClient;
import com.testing.finnet.client.request.InqPnmClientRequest;
import com.testing.finnet.client.response.InqPnmClientResponse;
import com.testing.finnet.model.request.FinancialPnmRequest;
import com.testing.finnet.model.request.InquiryPnmRequest;
import com.testing.finnet.model.response.FinancialResponse;

@Service
public class PnmServices {
	
	@Autowired
	private BillerClient billerClient;
	
	public InqPnmClientResponse inquiryPnm(InquiryPnmRequest request) {
		return billerClient.inquiry(InqPnmClientRequest.builder()
				.userName("finnetDev")
				.signature("5c717a12d0d12e90804af171bc59e3a7")
				.productCode("050016")
				.channel("6010")
				.terminal("G009TRKK")
				.terminalName("Loket Bidakara")
				.terminalLocation("Bidakara")
				.transactionType("38")
				.billNumber("11081241418376")
				.amount("0")
				.feeAmount("0")
				.bit61("11081241418376")
				.traxId("270418050016002")
				.timeStamp("27-04-2018 10:04:32:340")
				.addInfo1("")
				.addInfo2("")
				.addInfo3("")
				.build());
	}
	
	public FinancialResponse financialrespon(FinancialPnmRequest requestfinancial) {
		FinancialResponse response = new FinancialResponse();
		response.setAdmin(requestfinancial.getAdmin());
		response.setKode(requestfinancial.getKode());
		response.setTimeStamp(requestfinancial.getTimeStamp());
		response.setBillNumber(requestfinancial.getBillNumber());
		response.setAlterId(requestfinancial.getAlterId());
		response.setTerminalName(requestfinancial.getTerminalName());
		response.setTagihan(requestfinancial.getTagihan());
		response.setNominalAdmin(requestfinancial.getNominalAdmin());
		response.setTotal(requestfinancial.getTotal());
		response.setSignature(requestfinancial.getSignature());
		response.setRemark(requestfinancial.getRemark());
		response.setNoJurnal(requestfinancial.getNoJurnal());
		response.setUser(requestfinancial.getUser());
		return response;
	}
}
