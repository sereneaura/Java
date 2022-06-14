package Chapter6.Chapter7;

public class Course {
    private static int id = 100;
    private int courseId;
    private String courseName;

    public Course(String courseName) {

        courseId = id++;
        this.courseName = courseName;
    }

    public int getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return String.format("""
                CourseId: %d
                Course Name: %s
                """,getCourseId(),getCourseName());

    }

    public void setName(String newName) {
        courseName = newName;
    }
}
