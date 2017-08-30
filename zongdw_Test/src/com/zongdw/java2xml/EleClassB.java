package com.zongdw.java2xml;

import javax.xml.bind.annotation.XmlAttribute;  
import javax.xml.bind.annotation.XmlElement;  
  
public class EleClassB {  
  
    private String attrUserName;  
    private String attrPassword;  
      
    private String eleCode;  
    private String eleA;
    private String eleB;
      
    @XmlAttribute  
    public String getAttrUserName() {  
        return attrUserName;  
    }  
    public void setAttrUserName(String attrUserName) {  
        this.attrUserName = attrUserName;  
    }  
    @XmlAttribute(name="password")  
    public String getAttrPassword() {  
        return attrPassword;  
    }  
    public void setAttrPassword(String attrPassword) {  
        this.attrPassword = attrPassword;  
    }  
    @XmlElement  
    public String getEleCode() {  
        return eleCode;  
    }  
    public void setEleCode(String eleCode) {  
        this.eleCode = eleCode;  
    }
    public String getEleA() {
        return eleA;
    }
    public void setEleA(String eleA) {
        this.eleA = eleA;
    }
    public String getEleB() {
        return eleB;
    }
    public void setEleB(String eleB) {
        this.eleB = eleB;
    }  
      
}  
