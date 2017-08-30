package com.zongdw.testQrCodeRequest;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "response")
public class QrCodeResponse implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private General general;

	private Result result;

	public General getGeneral() {
		return general;
	}

	public void setGeneral(General general) {
		this.general = general;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
}
