package com.zongdw.testQrCodeRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
	"resultCode",
	"errorCode",
	"errorInfo",
	"tradeId",
	"refundId",
	"outTradeNo",
	"outRefundNo",
	"payAmount",
	"couponAmount",
	"refundAmount",
	"balance",
	"currencyCode",
	"timeStart",
	"timeEnd",
	"tradeStatus",
	"refundStatus",
	"recallFlag",
	"signature",
	"riskDataMap",
	"extDataMap"
})
@XmlRootElement(name = "result")
public class Result{
	protected String resultCode;
	protected String errorCode;
	protected String errorInfo;
	protected String tradeId;
	protected String outTradeNo;
	protected String payAmount;
	protected String couponAmount;
	protected String currencyCode;
	protected String timeEnd;
	protected String signature;
	protected String riskDataMap;
	protected String extDataMap;
	protected String tradeStatus;
	protected String recallFlag;
	protected String refundId;
	protected String refundStatus;
	protected String refundAmount;
	protected String outRefundNo;
	protected String timeStart;
	protected String balance;
	
	
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorInfo() {
		return errorInfo;
	}
	public void setErrorInfo(String errorInfo) {
		this.errorInfo = errorInfo;
	}
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public String getOutTradeNo() {
		return outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getCouponAmount() {
		return couponAmount;
	}
	public void setCouponAmount(String couponAmount) {
		this.couponAmount = couponAmount;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getTimeEnd() {
		return timeEnd;
	}
	public void setTimeEnd(String timeEnd) {
		this.timeEnd = timeEnd;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getRiskDataMap() {
		return riskDataMap;
	}
	public void setRiskDataMap(String riskDataMap) {
		this.riskDataMap = riskDataMap;
	}
	public String getExtDataMap() {
		return extDataMap;
	}
	public void setExtDataMap(String extDataMap) {
		this.extDataMap = extDataMap;
	}
	public String getTradeStatus() {
		return tradeStatus;
	}
	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getRecallFlag() {
		return recallFlag;
	}
	public void setRecallFlag(String recallFlag) {
		this.recallFlag = recallFlag;
	}
	public String getRefundId() {
		return refundId;
	}
	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}
	public String getRefundStatus() {
		return refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundAmount() {
		return refundAmount;
	}
	public void setRefundAmount(String refundAmount) {
		this.refundAmount = refundAmount;
	}
	public String getOutRefundNo() {
		return outRefundNo;
	}
	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}
	public String getTimeStart() {
		return timeStart;
	}
	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	
}
