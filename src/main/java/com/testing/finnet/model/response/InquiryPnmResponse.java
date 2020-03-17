package com.testing.finnet.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InquiryPnmResponse {
	private String kode;
	private String timeStamp;
	private String billNum;
	private String alterId;
	private String admin;
	private String termName;
	private String tagihan;
	private String feeAmount;
	private String total;
	private String signature;
	private String keterangan;	
}
