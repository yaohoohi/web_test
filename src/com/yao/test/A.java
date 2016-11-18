package com.yao.test;

public class A {
private int a;
private String s;

public String getS() {
	return s;
}

public void setS(String s) {
	this.s = s;
}

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public A(int a) {
	super();
	this.a = a;
}

@Override
public String toString() {
	return "A [a=" + a + ", s=" + s + "]";
}


}
