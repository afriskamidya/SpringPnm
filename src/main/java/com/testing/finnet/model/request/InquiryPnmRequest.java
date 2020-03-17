package com.testing.finnet.model.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InquiryPnmRequest {
	
	@NotBlank
	@Size(min = 3, max = 3, message = "Kode harus berjumlah 3 karakter")
	private String kode;
	
	@NotBlank
	@Size (min =19, max=19, message ="TimeStamp harus berformat yyyy-MM-dd hh:mm:ss")
	private String timeStamp;
	
	@NotBlank
	@Size(min=24, max=24, message="Bill Number Harus 24 Karakter Angka")
	private String billNumber;
}
