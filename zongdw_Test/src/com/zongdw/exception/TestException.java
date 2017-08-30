package com.zongdw.exception;

public class TestException {
    public static void tException() throws myException{
        throw new myException("cd", "errormsg");
    }
    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            tException();
        } catch (myException e) {
            // TODO: handle exception
            System.out.println("code:"+e.getCode());
            System.out.println("msg:"+e.getMsg());
        }
        //异常被catch住处理后，后面的代码仍然会执行
        System.out.println("b");
    }
    
}

class myException extends Exception{
    /** serialVersionUID: TODO */ 
    private static final long serialVersionUID = 1L;
    private String code;
    private String msg;
    
    public myException(String code,String msg) {
        // TODO Auto-generated constructor stub
        this.code = code;
        this.msg = msg;
    }
    
    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }
    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }
    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }
    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    
}
