package com.lost.javabean.pojo;

import java.util.List;

public class User {
	private int userId;
	private String userPhone;
	private String userPassword;
	private String userEmail;
	private String userName;
	private String userHead;
	private int userGrade;
	private String userGender;
	private List<Lost> userLostList;
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String userPhone, String userPassword, String userEmail, String userName, String userHead,
			int userGrade, String userGender, List<Lost> userLostList) {
		super();
		this.userId = userId;
		this.userPhone = userPhone;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.userName = userName;
		this.userHead = userHead;
		this.userGrade = userGrade;
		this.userGender = userGender;
		this.userLostList = userLostList;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserHead() {
		return userHead;
	}
	public void setUserHead(String userHead) {
		this.userHead = userHead;
	}
	public int getUserGrade() {
		return userGrade;
	}
	public void setUserGrade(int userGrade) {
		this.userGrade = userGrade;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public List<Lost> getUserLostList() {
		return userLostList;
	}
	public void setUserLostList(List<Lost> userLostList) {
		this.userLostList = userLostList;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPhone=" + userPhone + ", userPassword=" + userPassword + ", userEmail="
				+ userEmail + ", userName=" + userName + ", userHead=" + userHead + ", userGrade=" + userGrade
				+ ", userGender=" + userGender + ", userLostList=" + userLostList + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userEmail == null) ? 0 : userEmail.hashCode());
		result = prime * result + ((userGender == null) ? 0 : userGender.hashCode());
		result = prime * result + userGrade;
		result = prime * result + ((userHead == null) ? 0 : userHead.hashCode());
		result = prime * result + userId;
		result = prime * result + ((userLostList == null) ? 0 : userLostList.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + ((userPassword == null) ? 0 : userPassword.hashCode());
		result = prime * result + ((userPhone == null) ? 0 : userPhone.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userEmail == null) {
			if (other.userEmail != null)
				return false;
		} else if (!userEmail.equals(other.userEmail))
			return false;
		if (userGender == null) {
			if (other.userGender != null)
				return false;
		} else if (!userGender.equals(other.userGender))
			return false;
		if (userGrade != other.userGrade)
			return false;
		if (userHead == null) {
			if (other.userHead != null)
				return false;
		} else if (!userHead.equals(other.userHead))
			return false;
		if (userId != other.userId)
			return false;
		if (userLostList == null) {
			if (other.userLostList != null)
				return false;
		} else if (!userLostList.equals(other.userLostList))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (userPassword == null) {
			if (other.userPassword != null)
				return false;
		} else if (!userPassword.equals(other.userPassword))
			return false;
		if (userPhone == null) {
			if (other.userPhone != null)
				return false;
		} else if (!userPhone.equals(other.userPhone))
			return false;
		return true;
	}
	
	
}
