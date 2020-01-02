package com.accp.pojo;

public class Emp {
	private int id;
	private String name;
	private String position;
	private String money;
	private String sdate;
	private String bonus;
	private int did;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public String getBonus() {
		return bonus;
	}
	public void setBonus(String bonus) {
		this.bonus = bonus;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", position=" + position + ", money=" + money + ", sdate=" + sdate
				+ ", bonus=" + bonus + ", did=" + did + "]";
	}
	public Emp(int id, String name, String position, String money, String sdate, String bonus, int did) {
		super();
		this.id = id;
		this.name = name;
		this.position = position;
		this.money = money;
		this.sdate = sdate;
		this.bonus = bonus;
		this.did = did;
	}
	public Emp() {
		super();
	}
}
