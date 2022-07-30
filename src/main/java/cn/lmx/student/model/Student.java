package cn.lmx.student.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 学生基本信息
 */
public class Student implements Serializable {

	private static final long serialVersionUID = -6956947981866795431L;

	private int id;
	private String sno;
	private String name;
	private String sex;
	private String phone;
	private String address;
	private Date startDate;
	

	public Student() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sno=" + sno + ", name=" + name + ", sex=" + sex + ", phone=" + phone
				+ ", address=" + address + ", startDate=" + startDate + "]";
	}

}
