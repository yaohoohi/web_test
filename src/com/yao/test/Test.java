package com.yao.test;

public class Test {

	static public  A  fun(A a) {
		//change(a);
		a=new A(9);
		return a;
	}

	public static void main(String[] args) {
	String s="sss";
	change(s);
	System.out.println(s);
	}
	
	public static void change(String s){
	s.toUpperCase();
	}
}
