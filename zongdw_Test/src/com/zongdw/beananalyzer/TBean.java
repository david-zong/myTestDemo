package com.zongdw.beananalyzer;

/** 
 * Type Name: TBean <br> 
 * Description: 为测试BeanAnalyzer的测试Bean <br>
 * Date: 2016年5月23日 上午9:24:41 <br> 
 * @author author
 * @since JDK 1.6
 */
public class TBean {
    private String id;
    private String name;
    private String address;
    private String sex;
    
    public TBean(String id, String name, String address, String sex) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.sex = sex;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
}