package Chapter7;

import Chapter6.Chapter7.Course;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {
    Course myCourse = new Course("maths");

    @Test
    void CourseCanBeCreated() {
        assertNotNull(myCourse);
    }

    @Test
    void autoGenerateCourseId() {
        assertEquals(101, myCourse.getCourseId());
        myCourse = new Course("english");
        assertEquals(102, myCourse.getCourseId());
    }
    @Test
    void  getCourseName(){
        assertEquals("maths",myCourse.getCourseName());
    }
}