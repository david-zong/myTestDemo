<%@ page import="com.caucho.hessian.client.HessianProxyFactory,com.zongdw.hessian.BasicAPI"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
    HessianProxyFactory factory = new HessianProxyFactory();
    String url = ("http://" + request.getServerName()
                  + ":"
                  + request.getServerPort()
                  + request.getContextPath()
                  + "/hello");
    out.println(url);
    BasicAPI basic = (BasicAPI)factory.create(BasicAPI.class, url);
    out.println("Hello: " + basic.hello());
    out.println("Hello: " + basic.getUser().getUserName());
    out.println("Hello: " + basic.getUser().getPassword());
%>