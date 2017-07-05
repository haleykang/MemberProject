package com.haley.member.domain;

public class Member {

	private int code;
	private String id;
	private String pw;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "Member [code =" + code + ", id=" + id + ", pw=" + pw + "]\n";
	}

}
