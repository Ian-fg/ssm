package com.how2java.pojo;

public class Category {
	private int id;
	private String name;
	private String sex;
	private String nation;
	private String native1;
	private String major;
	private String phone;
	private String date;
	private String post;

	public String getSex() {
		return sex;
	}

	public String getNation() {
		return nation;
	}

	public String getNative1() {
		return native1;
	}

	public String getMajor() {
		return major;
	}

	public String getPhone() {
		return phone;
	}

	public String getDate() {
		return date;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public void setNative1(String native1) {
		this.native1 = native1;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

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
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
