package Chapter6.Chapter7;

import java.util.ArrayList;

public class School {
    private String name;
    private String location;
    private ArrayList<Chapter6.Chapter7.Course> listOfCourses = new ArrayList<>();
    private  ArrayList<Chapter6.Chapter7.Student> listOfStudents = new ArrayList<>();
    private ArrayList<Chapter6.Chapter7.Student> expelledStudents = new ArrayList<>();

    public School(String name, String location){
        this.name = name;
        this.location = location;
    }

    public String getSchoolName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void addCourse(Chapter6.Chapter7.Course course) {
        listOfCourses.add(course);
    }

    public Chapter6.Chapter7.Course getCourse(int courseId) {
        for(Chapter6.Chapter7.Course course: listOfCourses){
            if (course.getCourseId() == courseId){
                return course;
            }
        }
        throw new IllegalArgumentException("course with courseId: "+courseId+" not found");
    }

    public void getAllCourses() {
        for (Chapter6.Chapter7.Course course: listOfCourses){
            System.out.println(course);
        }
    }

    public void removeCourse(String courseName) {
        Chapter6.Chapter7.Course courseToBeRemoved = null;
        for(Chapter6.Chapter7.Course course: listOfCourses){
            if(course.getCourseName().equalsIgnoreCase(courseName)){
                courseToBeRemoved = course;
                break;
            }
        }
        if(courseToBeRemoved == null){
            throw new IllegalArgumentException("course with courseName: "+courseName+" not found");
        }
        listOfCourses.remove(courseToBeRemoved);

    }

    public void addStudent(Chapter6.Chapter7.Student student ){
        listOfStudents.add(student);
    }

    public Chapter6.Chapter7.Student getStudent(int studentId) {
        for(Chapter6.Chapter7.Student student: listOfStudents){
            if(student.getStudentId() == studentId){
                return student;
            }
        }
        throw new IllegalArgumentException("student with StudentId "+studentId+" not found");

    }


    public void getAllStudents() {
       for (Chapter6.Chapter7.Student student: listOfStudents){
           System.out.println(student);
       }
    }

    public void expelStudent(int studentId) {
        Chapter6.Chapter7.Student studentToBeExpelled = null;
        for(Chapter6.Chapter7.Student student: listOfStudents){
            if(student.getStudentId() == studentId){
                studentToBeExpelled = student;
                break;
            }
        }
        if(studentToBeExpelled == null){
            throw new IllegalArgumentException("student with StudentId "+studentId+" not found");

        }
        listOfStudents.remove(studentToBeExpelled);
        expelledStudents.add(studentToBeExpelled);
    }

    public void editInfo(String name,String oldName, String newName) {
        for(Chapter6.Chapter7.Student student : listOfStudents){
            if(student.getFirstName().equalsIgnoreCase(oldName)){
                if(name.equalsIgnoreCase("F")){
                    student.setFirstName(newName);
                    return;
                }
            }
            if(student.getLastName().equalsIgnoreCase(oldName)){
                if(name.equalsIgnoreCase("L")){
                    student.setLastName(newName);
                    return;
                }
            }
        }

     throw new IllegalArgumentException("student with Name \""+oldName+"\" not found");


    }
    public void editInfo(int studentId, int actualAge){
        for(Chapter6.Chapter7.Student student: listOfStudents){
            if(student.getStudentId() == studentId){
                student.setAge(actualAge);
                return;
            }
        }
        throw new IllegalArgumentException("student with StudentId "+studentId+" not found");

    }
    public void editInfo(int studentId, String actualGender){
        for(Chapter6.Chapter7.Student student: listOfStudents){
            if(student.getStudentId() == studentId){
                student.setGender(actualGender);
                return;
            }
        }
        throw new IllegalArgumentException("student with StudentId "+studentId+" not found");

    }

    public void getAllExpelledStudents() {
        for (Chapter6.Chapter7.Student student: expelledStudents){
            System.out.println(student);
        }
    }

    public void editCourseName(int id, String newName) {
        for (Chapter6.Chapter7.Course course: listOfCourses){
            if(course.getCourseId() == id){
                course.setName(newName);
                break;
            }
        }
        throw new IllegalArgumentException("course with courseId: "+id+" not found");
    }
}
