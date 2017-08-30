package com.zongdw.test;

import java.util.List;

/** 
 * Type Name: MamResponse <br> 
 * Description: 解析从MAM返回的json字符串 <br>
 * Date: 2016年10月21日 下午4:03:20 <br> 
 * @author david.zong
 * @since JDK 1.6
 */
public class MamResponse {
	private String resCode;
	private String resMsg;
	private Integer relType;
	private List<OperatorInfo> records;
	
	public MamResponse(String resCode, String resMsg, Integer relType, List<OperatorInfo> records) {
		this.resCode = resCode;
		this.resMsg = resMsg;
		this.relType = relType;
		this.records = records;
	}
	public MamResponse() {
	}
	
	public String getResCode() {
		return resCode;
	}
	public void setResCode(String resCode) {
		this.resCode = resCode;
	}
	public String getResMsg() {
		return resMsg;
	}
	public void setResMsg(String resMsg) {
		this.resMsg = resMsg;
	}
	public Integer getRelType() {
		return relType;
	}
	public void setRelType(Integer relType) {
		this.relType = relType;
	}
	public List<OperatorInfo> getRecords() {
		return records;
	}
	public void setRecords(List<OperatorInfo> records) {
		this.records = records;
	}
}

class OperatorInfo{
	private String mobile;
	private Long membercode;
	private Long merchantCode;
	private String rev1;
	private String rev2;
	private String rev3;
	
	public OperatorInfo(String mobile, Long membercode, Long merchantCode, String rev1, String rev2, String rev3) {
		this.mobile = mobile;
		this.membercode = membercode;
		this.merchantCode = merchantCode;
		this.rev1 = rev1;
		this.rev2 = rev2;
		this.rev3 = rev3;
	}
	public OperatorInfo() {
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Long getMembercode() {
		return membercode;
	}
	public void setMembercode(Long membercode) {
		this.membercode = membercode;
	}
	public Long getMerchantCode() {
		return merchantCode;
	}
	public void setMerchantCode(Long merchantCode) {
		this.merchantCode = merchantCode;
	}
	public String getRev1() {
		return rev1;
	}
	public void setRev1(String rev1) {
		this.rev1 = rev1;
	}
	public String getRev2() {
		return rev2;
	}
	public void setRev2(String rev2) {
		this.rev2 = rev2;
	}
	public String getRev3() {
		return rev3;
	}
	public void setRev3(String rev3) {
		this.rev3 = rev3;
	}
	
}