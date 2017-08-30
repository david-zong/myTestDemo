package com.zongdw.testQrCodeRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
	
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
	"version",
	"txnType",
	"appId",
	"merchantCode",
	"subMerchantCode",
	"subMerchantName",
	"deviceId",
	"ip"
})	

@XmlRootElement(name = "general")
public class General {
    protected String txnType;
    protected String appId;
    protected String merchantCode;
    protected String subMerchantCode;
    protected String subMerchantName;
    protected String deviceId;
    protected String version;
    protected String ip;
    
	public String getTxnType() {
		return txnType;
	}
	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getMerchantCode() {
		return merchantCode;
	}
	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}
	public String getSubMerchantCode() {
		return subMerchantCode;
	}
	public void setSubMerchantCode(String subMerchantCode) {
		this.subMerchantCode = subMerchantCode;
	}
	public String getSubMerchantName() {
		return subMerchantName;
	}
	public void setSubMerchantName(String subMerchantName) {
		this.subMerchantName = subMerchantName;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
}
