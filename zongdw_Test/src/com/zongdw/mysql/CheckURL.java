package com.zongdw.mysql;

import java.sql.*;

public class CheckURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://10.200.63.83:3310/ate?autoReconnect=true";
		String driver = "com.mysql.jdbc.Driver";
		try {
			Class.forName(driver).newInstance();
		} catch (Exception e) {
			System.out.println("无法加载驱动");
		} 
		Connection con;
		try {
			con = DriverManager.getConnection(url,"ate","lxd9hzsgta4kb2bc");
			Statement stmt=con.createStatement();
    		//4.执行SQL语句
    		//Statement有三种执行SQL语句的方法
//    		ResultSet rs=stmt.executeQuery("select * from T_ACC_APP_SOURCE ");
    		ResultSet rs=stmt.executeQuery("select * from T_ACC_ORDER_MASTER_098 ");
    		while(rs.next())
    		{
    			System.out.println(rs.getString(5));
//    			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" ");
    		}
			if(!con.isClosed())
				System.out.println("success");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
