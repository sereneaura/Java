package Chapter6.Chapter7;

import java.util.ArrayList;

public class Student {
    private ArrayList<Course> courseOffered = new ArrayList<>();
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private  int studentId;

    private static int Id = 1000;
    public Student(String firstName, String lastName,int age,String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        studentId = ++Id;
    }
    public void offerCourse(Course course){
        courseOffered.add(course);
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("""
                student Id: %d
                name: %s %s
                gender: %s
                age: %d
                """,getStudentId(),getFirstName(),getLastName(),getGender(),getAge());
    }

    public void setFirstName(String newName){
        firstName = newName;
    }

    public void setLastName(String newName) {
        lastName = newName;
    }

    public void setAge(int actualAge) {
        age = actualAge;
    }

    public void setGender(String actualGender) {
        gender = actualGender;
    }

    public Course getACourseOffered(String courseName) {
        for(Course course: courseOffered){
            if(course.getCourseName().equalsIgnoreCase(courseName)){
                return course;
            }
        }
        throw new IllegalArgumentException("Course with name "+courseName+" not found");

    }

    public void getAllCoursesOffered() {
        for(Course course: courseOffered){
            System.out.println(course);
        }
    }
}