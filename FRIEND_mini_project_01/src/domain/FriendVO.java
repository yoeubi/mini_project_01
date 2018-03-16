package domain;

import java.util.Date;

public class FriendVO {

	private String id;
	private String fId;
	private Date requestDate;
	private int acceptance;
	private String statueMsg;
	
	public String getId() {
		return id;
	}
	public String getStatueMsg() {
		return statueMsg;
	}
	public void setStatueMsg(String statueMsg) {
		this.statueMsg = statueMsg;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getfId() {
		return fId;
	}
	public void setfId(String fId) {
		this.fId = fId;
	}
	public Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	public int getAcceptance() {
		return acceptance;
	}
	public void setAcceptance(int acceptance) {
		this.acceptance = acceptance;
	}
	
	@Override
	public String toString() {
		return "FriendVO [id=" + id + ", fId=" + fId + ", requestDate=" + requestDate + ", acceptance=" + acceptance
				+ ", statueMsg=" + statueMsg + ", getId()=" + getId() + ", getStatueMsg()=" + getStatueMsg()
				+ ", getfId()=" + getfId() + ", getRequestDate()=" + getRequestDate() + ", getAcceptance()="
				+ getAcceptance() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
