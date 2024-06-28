package com.nareshit.constant;

public class Constant {
	public static final String INSERT = "insert into employee values(?,?,?,?)";
	public static final String UPDATE = "update employee set name=?, address=?, salary=? where id=?";
	public static final String DELETE = "delete from employee where id=?";
	public static final String GET_ALL = "select * from employee";
	public static final String GET_ONE = "select * from employee where id=?";
}
