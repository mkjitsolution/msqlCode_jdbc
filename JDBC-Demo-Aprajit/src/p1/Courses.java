package p1;

public class Courses {

	String courseName;
	String category;
	int duration;
	int tests;
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Courses(String courseName, String category, int duration, int tests) {
		super();
		this.courseName = courseName;
		this.category = category;
		this.duration = duration;
		this.tests = tests;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getTests() {
		return tests;
	}
	public void setTests(int tests) {
		this.tests = tests;
	}
	@Override
	public String toString() {
		return "[courseName=" + courseName + ", category=" + category + ", duration=" + duration + ", tests="
				+ tests + "]";
	}
	
	
}
