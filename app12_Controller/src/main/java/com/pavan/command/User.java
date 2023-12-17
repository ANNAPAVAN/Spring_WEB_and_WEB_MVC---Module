package com.pavan.command;

public class User {
	private String uname;
	private String upwd;
	private boolean maritalStatus1;
	private String maritalStatus2;
	private String[] uqual1;
	private String[] uqual2;
	private String ugender;
	private String uworklocation;
	private String[] uskillset;
	private String[] uhobbies;
	private String uprofession;
	private String uaddr;
	
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public boolean isMaritalStatus1() {
		return maritalStatus1;
	}

	public void setMaritalStatus1(boolean maritalStatus1) {
		this.maritalStatus1 = maritalStatus1;
	}

	public String getMaritalStatus2() {
		if(maritalStatus2==null) {
			maritalStatus2 = "married";
		}
		return maritalStatus2;
	}

	public void setMaritalStatus2(String maritalStatus2) {
		this.maritalStatus2 = maritalStatus2;
	}

	public String[] getUqual1() {
		return uqual1;
	}

	public void setUqual1(String[] uqual1) {
		this.uqual1 = uqual1;
	}

	public String[] getUqual2() {
		return uqual2;
	}

	public void setUqual2(String[] uqual2) {
		this.uqual2 = uqual2;
	}

	public String getUgender() {
		return ugender;
	}

	public void setUgender(String ugender) {
		this.ugender = ugender;
	}

	public String getUworklocation() {
		return uworklocation;
	}

	public void setUworklocation(String uworklocation) {
		this.uworklocation = uworklocation;
	}

	public String[] getUskillset() {
		return uskillset;
	}

	public void setUskillset(String[] uskillset) {
		this.uskillset = uskillset;
	}

	public String[] getUhobbies() {
		return uhobbies;
	}

	public void setUhobbies(String[] uhobbies) {
		this.uhobbies = uhobbies;
	}

	public String getUprofession() {
		return uprofession;
	}

	public void setUprofession(String uprofession) {
		this.uprofession = uprofession;
	}

	public String getUaddr() {
		return uaddr;
	}

	public void setUaddr(String uaddr) {
		this.uaddr = uaddr;
	}
	
	
	
	
	
	
}
