package model.dto;

public class Lecture {
	private int lectureID;
	private String title;
	private String classroom;
	private String professor;
	private int occupancy;
	private int onOff;
	private int registered;
	private int classroomLocation;
	private int lectureForm;
	private int interest;
	private int classTime;
	private int examForm;
	private int week;
	private int likes;
	
	public Lecture() {}
	
	public Lecture(int lectureID, String title, String classroom, String professor, int occupancy, int onOff,
			int registered, int classroomLocation, int lectureForm, int interest, int classTime, int examForm, int week,
			int likes) {
		this.lectureID = lectureID;
		this.title = title;
		this.classroom = classroom;
		this.professor = professor;
		this.occupancy = occupancy;
		this.onOff = onOff;
		this.registered = registered;
		this.classroomLocation = classroomLocation;
		this.lectureForm = lectureForm;
		this.interest = interest;
		this.classTime = classTime;
		this.examForm = examForm;
		this.week = week;
		this.likes = likes;
	}

	public int getLectureID() {
		return lectureID;
	}
	
	public void setLectureID(int lectureID) {
		this.lectureID = lectureID;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getClassroom() {
		return classroom;
	}
	
	public void setClassroom(String classroom) {
		this.classroom = classroom;
	}
	
	public String getProfessor() {
		return professor;
	}
	
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	public int getOccupancy() {
		return occupancy;
	}
	
	public void setOccupancy(int occupancy) {
		this.occupancy = occupancy;
	}
	
	public int getOnOff() {
		return onOff;
	}
	
	public void setOnOff(int onOff) {
		this.onOff = onOff;
	}
	
	public int getRegistered() {
		return registered;
	}
	
	public void setRegistered(int registered) {
		this.registered = registered;
	}
	
	public int getClassroomLocation() {
		return classroomLocation;
	}
	
	public void setClassroomLocation(int classroomLocation) {
		this.classroomLocation = classroomLocation;
	}
	
	public int getLectureForm() {
		return lectureForm;
	}
	
	public void setLectureForm(int lectureForm) {
		this.lectureForm = lectureForm;
	}
	
	public int getInterest() {
		return interest;
	}
	
	public void setInterest(int interest) {
		this.interest = interest;
	}
	
	public int getClassTime() {
		return classTime;
	}
	
	public void setClassTime(int classTime) {
		this.classTime = classTime;
	}
	
	public int getExamForm() {
		return examForm;
	}
	
	public void setExamForm(int examForm) {
		this.examForm = examForm;
	}
	
	public int getWeek() {
		return week;
	}
	
	public void setWeek(int week) {
		this.week = week;
	}
	
	public int getLikes() {
		return likes;
	}
	
	public void setLikes(int likes) {
		this.likes = likes;
	}

	@Override
	public String toString() {
		return "Lecture [lectureID=" + lectureID + ", title=" + title + ", classroom=" + classroom + ", professor="
				+ professor + ", occupancy=" + occupancy + ", onOff=" + onOff + ", registered=" + registered
				+ ", classroomLocation=" + classroomLocation + ", lectureForm=" + lectureForm + ", interest=" + interest
				+ ", classTime=" + classTime + ", examForm=" + examForm + ", week=" + week + ", likes=" + likes + "]";
	}
	
}
