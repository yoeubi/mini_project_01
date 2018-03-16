package domain;

import java.util.Date;

public class FriendVO {
	private String id;
	private String fId;
	private Date requestDate;
	private int acceptance;
	public String getId() {
		return id;
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

}
