package com.testing.finnet.client.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InqPnmClientResponse {
	private String bit61;
	private String custData;
	private String productId;
	private String custId;
	private String period;
	private String custName;
	private String custInfo;
	private String dueDate;
	private String amountInfo;
	private String penalty;
	private String total;
	private String feeAmount;
	private String reffId;
	private String resultCode;
	private String resultDesc;
	private String sysCode;
	private String productCode;
	private String terminal;
	private String transType;
	private String feeAmount1;
	private String Amount;
	private String bit48;
	private String traxId;
	private String timeStamp;
	private String timeStampServer;
}
