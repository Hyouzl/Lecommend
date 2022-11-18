package model.dto;

public class Registeration {
	private int registerationID;
	private int userID;
	private int lectureID;
	private int validity;
	
	public Registeration() {}
	
	public Registeration(int registerationID, int userID, int lectureID, int validity) {
		super();
		this.registerationID = registerationID;
		this.userID = userID;
		this.lectureID = lectureID;
		this.validity = validity;
	}

	public int getRegisterationID() {
		return registerationID;
	}
	
	public void setRegisterationID(int registerationID) {
		this.registerationID = registerationID;
	}
	
	public int getUserID() {
		return userID;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	public int getLectureID() {
		return lectureID;
	}
	
	public void setLectureID(int lectureID) {
		this.lectureID = lectureID;
	}
	
	public int getValidity() {
		return validity;
	}
	
	public void setValidity(int validity) {
		this.validity = validity;
	}

	@Override
	public String toString() {
		return "Registeration [registerationID=" + registerationID + ", userID=" + userID + ", lectureID=" + lectureID
				+ ", validity=" + validity + "]";
	}
	
}
