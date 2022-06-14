package Chapter7;

import Chapter6.Chapter7.Course;
import Chapter6.Chapter7.School;
import Chapter6.Chapter7.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student student = new Student("abigael","paul",20,"female");
    @Test void getFirstName(){
        assertEquals(1001, student.getStudentId());
        assertEquals("abigael",student.getFirstName());
        assertEquals("paul",student.getLastName());
        assertEquals("female", student.getGender());
        assertEquals(20,student.getAge());
    }
    @Test void offerCourses(){
        School school = new School("waleSchool","sabo");
        Course course = new Course("Mathematics");
        school.addCourse(course);

        student.offerCourse(course);
        assertEquals(course,student.getACourseOffered("mathematics"));

        course = new Course("English");
        school.addCourse(course);
        student.offerCourse(course);

        assertEquals(course,student.getACourseOffered("english"));

        student.getAllCoursesOffered();
    }

}