package com.testing.finnet.model.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class FinancialPnmRequest {
	@NotBlank
	@Size (min = 3, max=3, message="Harus 3 Karakter")
	private String kode;
	@NotBlank
	@Size (min = 19, max=19, message="TimeStamp harus berformat yyyy-MM-dd hh:mm:ss")
	private String timeStamp;
	@NotBlank
	@Size (min = 16, max=24, message="Minimal 16 Karakter")
	private String billNumber;
	@NotBlank
	@Size (min = 12, max=12, message="Kode Layanan Asuransi")
	private String alterId;
	@NotBlank
	@Size (min = 5, max=19, message="Isikan dengan Jumlah Admin")
	private String admin;
	@NotBlank
	@Size (min = 5, max=50, message="Minimal 5 Karakter")
	private String terminalName;
	@NotBlank
	@Size (min = 5, max=12, message="Isikan dengan Nominal Tagihan")
	private String tagihan;
	@NotBlank
	@Size (min = 3, max=12, message="Isikan dengan Jumlah Nominal biaya Admin")
	private String nominalAdmin;
	@NotBlank
	@Size (min = 5, max=12, message="Total Keseluruhan Pembayaran")
	private String total;
	@NotBlank
	@Size (min = 10, max=50, message="Generate Id")
	private String signature;
	@NotBlank
	@Size (min = 10, max=50, message="Harus diiskan dengan nomor Payment Reff")
	private String remark;
	@NotBlank
	@Size (min = 19, max=19, message="Diiskan dengan Nomor Jurnal")
	private String noJurnal;
	@NotBlank
	@Size (min = 3, max=6, message="Kode Kasir")
	private String user;
	public String getKode() {
		return kode;
	}
	public void setKode(String kode) {
		this.kode = kode;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getBillNumber() {
		return billNumber;
	}
	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}
	public String getAlterId() {
		return alterId;
	}
	public void setAlterId(String alterId) {
		this.alterId = alterId;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		this.admin = admin;
	}
	public String getTerminalName() {
		return terminalName;
	}
	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}
	public String getTagihan() {
		return tagihan;
	}
	public void setTagihan(String tagihan) {
		this.tagihan = tagihan;
	}
	public String getNominalAdmin() {
		return nominalAdmin;
	}
	public void setNominalAdmin(String nominalAdmin) {
		this.nominalAdmin = nominalAdmin;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getNoJurnal() {
		return noJurnal;
	}
	public void setNoJurnal(String noJurnal) {
		this.noJurnal = noJurnal;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
}
