package Chapter7;

import Chapter6.Chapter7.Course;
import Chapter6.Chapter7.School;
import Chapter6.Chapter7.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    School school = new School("MrWaleSchool","sabo");
    @Test
    void getSchoolNAmeAndAddress(){
        assertEquals("MrWaleSchool",school.getSchoolName());
        assertEquals("sabo",school.getLocation());
    }
    @Test void schoolCanHaveCourses(){
        Course course = new Course("Mathematics");
        school.addCourse(course);
        assertEquals(course,school.getCourse(100));

        course = new Course("English");
        school.addCourse(course);
        assertEquals(course,school.getCourse(101));
        System.out.println("before delete");
        school.getAllCourses();


        school.removeCourse("mathematics");
        System.out.println("after delete");
        school.getAllCourses();
    }
    @Test
    void schoolCanHaveStudent(){
        Student student = new Student("John","Abdul",10,"Male");
        school.addStudent(student);

        assertEquals(student,school.getStudent(1001));

        student = new Student("kike","lomo",19,"female");
        school.addStudent(student);

        assertEquals(student,school.getStudent(1002));
        System.out.println("before edit student");

        school.getAllStudents();


        System.out.println("after edit");

        school.editInfo("F","john","Funsho");
        school.editInfo("L","Abdul","Akintolu");
        school.editInfo(1001,19);
        school.editInfo(1001,"non-Binary");

        school.expelStudent(1002);
        school.expelStudent(1001);
        System.out.println("list of expelled students");
        school.getAllExpelledStudents();
    }

}