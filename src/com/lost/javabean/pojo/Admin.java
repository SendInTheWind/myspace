package com.lost.javabean.pojo;

import java.util.List;

public class Admin {
	private int adminId;
	private String adminName;
	private String adminAccoutNumber;
	private String adminPassword;
	private List<Lost> adminLostList;
	private List<User> adminUserList;
	public Admin() {
		// TODO Auto-generated constructor stub
	}
	public Admin(int adminId, String adminName, String adminAccoutNumber, String adminPassword,
			List<Lost> adminLostList, List<User> adminUserList) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminAccoutNumber = adminAccoutNumber;
		this.adminPassword = adminPassword;
		this.adminLostList = adminLostList;
		this.adminUserList = adminUserList;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminAccoutNumber() {
		return adminAccoutNumber;
	}
	public void setAdminAccoutNumber(String adminAccoutNumber) {
		this.adminAccoutNumber = adminAccoutNumber;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public List<Lost> getAdminLostList() {
		return adminLostList;
	}
	public void setAdminLostList(List<Lost> adminLostList) {
		this.adminLostList = adminLostList;
	}
	public List<User> getAdminUserList() {
		return adminUserList;
	}
	public void setAdminUserList(List<User> adminUserList) {
		this.adminUserList = adminUserList;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", adminAccoutNumber=" + adminAccoutNumber
				+ ", adminPassword=" + adminPassword + ", adminLostList=" + adminLostList + ", adminUserList="
				+ adminUserList + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adminAccoutNumber == null) ? 0 : adminAccoutNumber.hashCode());
		result = prime * result + adminId;
		result = prime * result + ((adminLostList == null) ? 0 : adminLostList.hashCode());
		result = prime * result + ((adminName == null) ? 0 : adminName.hashCode());
		result = prime * result + ((adminPassword == null) ? 0 : adminPassword.hashCode());
		result = prime * result + ((adminUserList == null) ? 0 : adminUserList.hashCode());
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
		Admin other = (Admin) obj;
		if (adminAccoutNumber == null) {
			if (other.adminAccoutNumber != null)
				return false;
		} else if (!adminAccoutNumber.equals(other.adminAccoutNumber))
			return false;
		if (adminId != other.adminId)
			return false;
		if (adminLostList == null) {
			if (other.adminLostList != null)
				return false;
		} else if (!adminLostList.equals(other.adminLostList))
			return false;
		if (adminName == null) {
			if (other.adminName != null)
				return false;
		} else if (!adminName.equals(other.adminName))
			return false;
		if (adminPassword == null) {
			if (other.adminPassword != null)
				return false;
		} else if (!adminPassword.equals(other.adminPassword))
			return false;
		if (adminUserList == null) {
			if (other.adminUserList != null)
				return false;
		} else if (!adminUserList.equals(other.adminUserList))
			return false;
		return true;
	}
	
}
