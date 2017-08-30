package com.zongdw.testQrCodeRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
	"outTradeNo",
	"outRefundNo",
	"channelType",
	"authCode",
	"pan",
	"pinNum",
	"pinEnvelope",  
	"pinSign",
	"currencyCode",
	"tradeId",
	"refundId",
	"opUserId",
	"requestTime",
	"bizCode",
	"payAmount",
	"refundAmount",
	"timeStart",
	"timeExpire",
	"productTag",
	"productDesc",
	"riskDataMap",
	"extDataMap",
	"signature"
})
@XmlRootElement(name = "params")
public class Params{
	protected String outTradeNo;
	protected String channelType;
	protected String authCode;
	protected String pan;
	protected String pinNum;
	protected String pinEnvelope;
	protected String pinSign;
	protected String payAmount;
	protected String currencyCode;
	protected String timeStart;
	protected String timeExpire;
	protected String productTag;
	protected String productDesc;
	protected String signature;
	protected String riskDataMap;
	protected String extDataMap;
	protected String tradeId;
	protected String refundId;
	protected String opUserId;
	protected String refundAmount;
	protected String outRefundNo;
	protected String requestTime;
	protected String bizCode;
	
	
	public String getOutTradeNo() {
		return outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getChannelType() {
		return channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}
	public String getAuthCode() {
		return authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public String getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getTimeStart() {
		return timeStart;
	}
	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}
	public String getTimeExpire() {
		return timeExpire;
	}
	public void setTimeExpire(String timeExpire) {
		this.timeExpire = timeExpire;
	}
	public String getProductTag() {
		return productTag;
	}
	public void setProductTag(String productTag) {
		this.productTag = productTag;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
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
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public String getRefundId() {
		return refundId;
	}
	public void setRefundId(String refundId) {
		this.refundId = refundId;
	}
	public String getOpUserId() {
		return opUserId;
	}
	public void setOpUserId(String opUserId) {
		this.opUserId = opUserId;
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
	
	public String getRequestTime() {
		return requestTime;
	}
	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}
	public String getBizCode() {
		return bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getPinNum() {
		return pinNum;
	}
	public void setPinNum(String pinNum) {
		this.pinNum = pinNum;
	}
	public String getPinEnvelope() {
		return pinEnvelope;
	}
	public void setPinEnvelope(String pinEnvelope) {
		this.pinEnvelope = pinEnvelope;
	}
	public String getPinSign() {
		return pinSign;
	}
	public void setPinSign(String pinSign) {
		this.pinSign = pinSign;
	}
	
}
