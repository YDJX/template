package org.daemon.belief.mythink.pojo;

import java.util.Map;

public class Userinfo {

	private int userId;
	private String userName;
	private String userPwd;
	private String idCardNo;
	private java.sql.Date birthDate;
	private int age;

	private String email;
	private String chattool;
	private String remark;

	private String degree; // 学位
	private String education; // 学历
	private String experience; // 工作经验

	private Map<String, String> otherinfo;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getIdCardNo() {
		return idCardNo;
	}

	public void setIdCardNo(String idCardNo) {
		this.idCardNo = idCardNo;
	}

	public java.sql.Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(java.sql.Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getChattool() {
		return chattool;
	}

	public void setChattool(String chattool) {
		this.chattool = chattool;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public Map<String, String> getOtherinfo() {
		return otherinfo;
	}

	public void setOtherinfo(Map<String, String> otherinfo) {
		this.otherinfo = otherinfo;
	}

}
