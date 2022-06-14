package Chapter6.Chapter7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static School school;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        school = new School("Semicolon", "Sabo");
        System.out.println("Welcome to Semicolon");
        try{
            addCourse();

            int exit = 0;
            while (exit!=-1){
                System.out.println("""
                1 -> Add student
                2 -> Add course
                3 -> view all Students
                4 -> view all Courses
                5 -> expel Student
                6 -> remove courses
                7 -> edit Student Info
                8 -> edit Course Info
                9 -> exit
                """);
                int userInput = scanner.nextInt();
                switch (userInput){
                    case 1-> addStudent();
                    case 2-> addCourse();
                    case 3-> school.getAllStudents();
                    case 4 -> school.getAllCourses();
                    case 5 -> expelStudents();
                    case 6-> removeCourses();
                    case 7 -> editStudentInfo();
                    case 8 -> editCourseInfo();
                    case 9 -> exit = -1;
                }
            }
        }catch (InputMismatchException | IllegalArgumentException e){
            System.out.println(e);
        }


    }

    private static void editCourseInfo() {
        int exit = 0;
        while (exit!= -1){
            System.out.println("enter course id");
            int id = scanner.nextInt();
            System.out.println("enter new name for course");
            String newName = scanner.next();
            school.editCourseName(id,newName);

            System.out.println("press 1 to edit another course");
            int input = scanner.nextInt();
            if(input != 1){
                exit = -1;
            }
        }

    }

    private static void editStudentInfo() {
        int exit = 0;
        while (exit!= -1){
            System.out.println("""
                1. edit firstName
                2. edit lastName
                3. edit age
                4. edit Gender
                5. exit
                """);
            int user_input = scanner.nextInt();
            switch (user_input){
                case 1-> {
                    System.out.println("enter current first name");
                    String oldName = scanner.next();
                    System.out.println("enter new first name");
                    String newName = scanner.next();
                    school.editInfo("F",oldName,newName);
                    System.out.println("edit successful");
                }
                case 2->{
                    System.out.println("enter current last name");
                    String oldName = scanner.next();
                    System.out.println("enter new last name");
                    String newName = scanner.next();
                    school.editInfo("L",oldName,newName);
                    System.out.println("edit successful");
                }
                case 3 ->{
                    System.out.println("enter student id");
                    int id = scanner.nextInt();
                    System.out.println("enter new age");
                    int newAge = scanner.nextInt();
                    school.editInfo(id,newAge);
                    System.out.println("edit successful");
                }
                case 4 ->{
                    System.out.println("enter student id");
                    int id = scanner.nextInt();
                    System.out.println("enter new gender");
                    String gender = scanner.next();
                    school.editInfo(id,gender);
                    System.out.println("edit successful");
                }
            }
            System.out.println("press 1 to edit another info");
            int input = scanner.nextInt();
            if(input != 1){
                exit = -1;
            }
        }


    }

    private static void removeCourses() {
        System.out.println("enter course name");
        String courseName = scanner.next();
        school.removeCourse(courseName);
        System.out.println("course successfully removed");

    }

    private static void expelStudents() {
        System.out.println("enter student id: ");
        int id = scanner.nextInt();
        school.expelStudent(id);
        System.out.println("student expelled successfully");
    }

    public  static void addStudent(){
        int sentinel = 0;
        while (sentinel!= -1){
            System.out.println("enter first name: ");
            String firstName = scanner.next();

            System.out.println("enter last name: ");
            String lastName = scanner.next();

            System.out.println("enter age: ");
            int age = scanner.nextInt();

            System.out.println("enter gender: ");
            String gender = scanner.next();

            Student student = new Student(firstName,lastName,age,gender);
            school.addStudent(student);
            int exit = 0;
            while(exit != -1){
                System.out.println("these are our list of courses");
                school.getAllCourses();
                System.out.println("enter course id to offer course");
                int courseId = scanner.nextInt();
                Course course = school.getCourse(courseId);
                student.offerCourse(course);

                System.out.println("enter 1 to offer another course?");
                int userInput = scanner.nextInt();
                if(userInput != 1){
                    exit = -1;
                }

            }

            System.out.println("press 1 to add another  student");
            int user_input = scanner.nextInt();
            if(user_input!=1){
                sentinel = -1;
            }
        }

    }
    public  static void addCourse(){

        int sentinel = 0;
        while (sentinel!= -1){
            System.out.println("enter course name: ");
            String courseName = scanner.next();
            Course course = new Course(courseName);
            school.addCourse(course);
            System.out.println("press 1 to add another course or 0 to end");
            int user_input = scanner.nextInt();
            if(user_input!=1){
                sentinel = -1;
            }
        }

    }
}
