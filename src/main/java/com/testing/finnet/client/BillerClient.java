package com.testing.finnet.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.testing.finnet.client.request.InqPnmClientRequest;
import com.testing.finnet.client.response.InqPnmClientResponse;
import com.testing.finnet.model.request.FinancialPnmRequest;
import com.testing.finnet.model.response.FinancialResponse;

@FeignClient(value ="biller", url="https://demos.finnet.co.id/frame/json/index.php")
public interface BillerClient {
	
	@RequestMapping(method = RequestMethod.POST, value = "/")
	InqPnmClientResponse inquiry (@RequestBody InqPnmClientRequest request);
	
	@RequestMapping(method = RequestMethod.POST, value = "/")
	FinancialResponse financial (@RequestBody FinancialPnmRequest requestfinancial );
}
