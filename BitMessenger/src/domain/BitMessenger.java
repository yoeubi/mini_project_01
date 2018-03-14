package domain;

import java.util.Date;

public class BitMessenger {
	private int no;
	private String id;
	private String pass;
	private String name;
	private String phonNo;
	private String passHint;
	private String passKey;
	private Date joinDate;
	private int invisible;
	private int blockSearch;
	private String statueMsg;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhonNo() {
		return phonNo;
	}
	public void setPhonNo(String phonNo) {
		this.phonNo = phonNo;
	}
	public String getPassHint() {
		return passHint;
	}
	public void setPassHint(String passHint) {
		this.passHint = passHint;
	}
	public String getPassKey() {
		return passKey;
	}
	public void setPassKey(String passKey) {
		this.passKey = passKey;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public int getInvisible() {
		return invisible;
	}
	public void setInvisible(int invisible) {
		this.invisible = invisible;
	}
	public int getBlockSearch() {
		return blockSearch;
	}
	public void setBlockSearch(int blockSearch) {
		this.blockSearch = blockSearch;
	}
	public String getStatueMsg() {
		return statueMsg;
	}
	public void setStatueMsg(String statueMsg) {
		this.statueMsg = statueMsg;
	}
}
