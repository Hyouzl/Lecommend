package model.dto;

public class Like {
	private int likeID;
	private int userID;
	private int lectureID;
	private int validity;
	
	public Like() {}
	
	public Like(int likeID, int userID, int lectureID, int validity) {
		super();
		this.likeID = likeID;
		this.userID = userID;
		this.lectureID = lectureID;
		this.validity = validity;
	}

	public int getLikeID() {
		return likeID;
	}
	
	public void setLikeID(int likeID) {
		this.likeID = likeID;
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
		return "Like [likeID=" + likeID + ", userID=" + userID + ", lectureID=" + lectureID + ", validity=" + validity
				+ "]";
	}
	
}
