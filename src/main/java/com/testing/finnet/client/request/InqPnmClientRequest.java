package com.testing.finnet.client.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InqPnmClientRequest {
	private String userName;
	private String signature;
	private String productCode;
	private String channel;
	private String terminal;
	private String terminalName;
	private String terminalLocation;
	private String transactionType;
	private String billNumber;
	private String amount;
	private String feeAmount;
	private String bit61;
	private String traxId;
	private String timeStamp;
	private String addInfo1;
	private String addInfo2;
	private String addInfo3;
}
