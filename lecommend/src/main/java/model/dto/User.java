package model.dto;

public class User {
	private int userID;
	private String pw;
	private String major;
	
	public User() {}
	
	public User(int userID, String pw, String major) {
		this.userID = userID;
		this.pw = pw;
		this.major = major;
	}
	
	public int getUserID() {
		return userID;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", pw=" + pw + ", major=" + major + "]";
	}
	
}
