package com.example.api.model.webkorps;

public class Book1 {
private String bname;

public String getBname() {
	return bname;
}

public void setBname(String bname) {
	this.bname = bname;
	
}

public Book1(String bname) {
	super();
	this.bname = bname;
}




public Book1() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Book [bname=" + bname + "]";
}
}
