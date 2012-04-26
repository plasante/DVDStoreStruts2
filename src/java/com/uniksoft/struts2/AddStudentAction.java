package com.uniksoft.struts2;

import com.opensymphony.xwork2.ActionSupport;
import com.uniksoft.hibernate.StudentDAO;
import java.util.ArrayList;
import java.util.List;

public class AddStudentAction extends ActionSupport {
    private String firstName;
    private String lastName;
    private int marks;
    
    List<Student> students = new ArrayList<Student>();
    List<Student> studentsByFirstName = new ArrayList<Student>();
    
    @Override
    public String execute() throws Exception {
        Student student = new Student(firstName, lastName, marks);
        StudentDAO dao = new StudentDAO();
        dao.addStudent(student);
        return "success";
    }
    
    public String listStudents() throws Exception {
        StudentDAO dao = new StudentDAO();
        students = dao.getStudents();
        studentsByFirstName = dao.getStudentsByFirstName();
        return "success";
    }

    public String listStudentsByFirstName() throws Exception {
        StudentDAO dao = new StudentDAO();
        studentsByFirstName = dao.getStudentsByFirstName();
        return "success";
    }
    
    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudentsByFirstName() {
        return studentsByFirstName;
    }

    public void setStudentsByFirstName(List<Student> studentsByFirstName) {
        this.studentsByFirstName = studentsByFirstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    
}
