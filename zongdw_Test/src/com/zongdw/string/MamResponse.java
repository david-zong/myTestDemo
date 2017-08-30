package com.zongdw.string;

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
