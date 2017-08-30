package com.zongdw.testQrCodeRequest;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class TestQrCodeRequest {
    
    public static void main(String[] args) {
        QrCodeRequest qrCodeRequest = new QrCodeRequest();
        General general = new General();
        Params params = new Params();
        
        general.setAppId("appid01");
        general.setMerchantCode("1001");
        
        params.setAuthCode("1234");
        params.setBizCode("123");
        params.setSignature("sign222");
        
        qrCodeRequest.setGeneral(general);
        qrCodeRequest.setParams(params);
        qrCodeRequest.setSignature("sign1111");
        
        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(QrCodeRequest.class);
            Marshaller mar = context.createMarshaller();
            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            mar.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
            
            StringWriter writer = new StringWriter();
            
            mar.marshal(qrCodeRequest, writer);
            
            System.out.println(writer.toString());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        
    }
    
}
