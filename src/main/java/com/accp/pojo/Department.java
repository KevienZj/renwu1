package com.accp.pojo;

public class Department {
	private int did;
	private String dname;
	private String daddress;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDaddress() {
		return daddress;
	}
	public void setDaddress(String daddress) {
		this.daddress = daddress;
	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", daddress=" + daddress + "]";
	}
	public Department(int did, String dname, String daddress) {
		super();
		this.did = did;
		this.dname = dname;
		this.daddress = daddress;
	}
	public Department() {
		super();
	}
}
