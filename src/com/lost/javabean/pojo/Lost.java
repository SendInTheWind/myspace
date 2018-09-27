package com.lost.javabean.pojo;

import java.util.List;

/**
 * @author Administrator
 *
 */
public class Lost {
	private int lostId;
	private String lostHead;	
	private String lostTime;
	private String lostSite;
	private String lostJudge;
	private String lostDescribe;
	private List<Type> lostTypeList;
	public Lost() {
		// TODO Auto-generated constructor stub
	}
	public Lost(int lostId, String lostHead, String lostTime, String lostSite, String lostJudge, String lostDescribe,
			List<Type> lostTypeList) {
		super();
		this.lostId = lostId;
		this.lostHead = lostHead;
		this.lostTime = lostTime;
		this.lostSite = lostSite;
		this.lostJudge = lostJudge;
		this.lostDescribe = lostDescribe;
		this.lostTypeList = lostTypeList;
	}
	public int getLostId() {
		return lostId;
	}
	public void setLostId(int lostId) {
		this.lostId = lostId;
	}
	public String getLostHead() {
		return lostHead;
	}
	public void setLostHead(String lostHead) {
		this.lostHead = lostHead;
	}
	public String getLostTime() {
		return lostTime;
	}
	public void setLostTime(String lostTime) {
		this.lostTime = lostTime;
	}
	public String getLostSite() {
		return lostSite;
	}
	public void setLostSite(String lostSite) {
		this.lostSite = lostSite;
	}
	public String getLostJudge() {
		return lostJudge;
	}
	public void setLostJudge(String lostJudge) {
		this.lostJudge = lostJudge;
	}
	public String getLostDescribe() {
		return lostDescribe;
	}
	public void setLostDescribe(String lostDescribe) {
		this.lostDescribe = lostDescribe;
	}
	public List<Type> getLostTypeList() {
		return lostTypeList;
	}
	public void setLostTypeList(List<Type> lostTypeList) {
		this.lostTypeList = lostTypeList;
	}
	@Override
	public String toString() {
		return "Lost [lostId=" + lostId + ", lostHead=" + lostHead + ", lostTime=" + lostTime + ", lostSite=" + lostSite
				+ ", lostJudge=" + lostJudge + ", lostDescribe=" + lostDescribe + ", lostTypeList=" + lostTypeList
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((lostDescribe == null) ? 0 : lostDescribe.hashCode());
		result = prime * result + ((lostHead == null) ? 0 : lostHead.hashCode());
		result = prime * result + lostId;
		result = prime * result + ((lostJudge == null) ? 0 : lostJudge.hashCode());
		result = prime * result + ((lostSite == null) ? 0 : lostSite.hashCode());
		result = prime * result + ((lostTime == null) ? 0 : lostTime.hashCode());
		result = prime * result + ((lostTypeList == null) ? 0 : lostTypeList.hashCode());
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
		Lost other = (Lost) obj;
		if (lostDescribe == null) {
			if (other.lostDescribe != null)
				return false;
		} else if (!lostDescribe.equals(other.lostDescribe))
			return false;
		if (lostHead == null) {
			if (other.lostHead != null)
				return false;
		} else if (!lostHead.equals(other.lostHead))
			return false;
		if (lostId != other.lostId)
			return false;
		if (lostJudge == null) {
			if (other.lostJudge != null)
				return false;
		} else if (!lostJudge.equals(other.lostJudge))
			return false;
		if (lostSite == null) {
			if (other.lostSite != null)
				return false;
		} else if (!lostSite.equals(other.lostSite))
			return false;
		if (lostTime == null) {
			if (other.lostTime != null)
				return false;
		} else if (!lostTime.equals(other.lostTime))
			return false;
		if (lostTypeList == null) {
			if (other.lostTypeList != null)
				return false;
		} else if (!lostTypeList.equals(other.lostTypeList))
			return false;
		return true;
	}
	
}
