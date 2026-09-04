public class Course {
    private String courseName;
    private String courseCode;
    private int credits;

    public Course(String courseName, String courseCode, int credits) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = 0; // Default value for credits
    }
    public boolean enroll()
    {
        if (this.credits > 0) {
            System.out.println("Enrolled in course: " + this.courseName);
            return true;
        } else {
            System.out.println("Cannot enroll in course: " + this.courseName + ". Credits must be greater than 0.");
            return false;
        }
    }
    public boolean Isfull()
    {
        return this.credits > 0;
    }
    public String toString() {
        return "Course Name: " + courseName + ", Course Code: " + courseCode + ", Credits: " + credits;
    }
}
