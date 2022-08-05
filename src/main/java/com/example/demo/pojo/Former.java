package com.example.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="formerdata")
public class Former {
	@Id
	private int id;
	private String name;
	private String city;
	private int mobile_no;
	private int age;
	public Former() {
		
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "FormerData [id=" + id + ", name=" + name + ", city=" + city + ", mobile_no=" + mobile_no + ", age="
				+ age + "]";
	}
	

}
