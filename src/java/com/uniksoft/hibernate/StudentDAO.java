package com.uniksoft.hibernate;

import com.uniksoft.struts2.Student;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class StudentDAO {
    
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<Student>();
        try {
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Transaction t = null;
            try {
                Session s = sf.openSession();
                t = s.beginTransaction();
                students = s.createQuery("from Student").list();
                t.commit();
            } catch (Exception e) {
                if ( t != null ) t.rollback();
            }
        } catch (Exception e) {} // The exception is swallowed.
        return students;
    }
    
    public List<Student> getStudentsByFirstName() {
        List<Student> students = new ArrayList<Student>();
        try {
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Transaction t = null;
            try {
                Session s = sf.openSession();
                t = s.beginTransaction();
                students = s.createQuery("from Student").list();
                t.commit();
            } catch (Exception e) {
                if ( t != null ) t.rollback();
            }
        } catch (Exception e) {} // The exception is swallowed.
        return students;
    }
    
    public void addStudent(Student student) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Transaction t = null;
        try {
            Session s = sf.openSession();
            t = s.beginTransaction();
            s.persist(student);
            t.commit();
        } catch (Exception e) {
            System.out.println("** addStudent error: " + e.toString());
            if ( t != null ) t.rollback();
        }
    }
}
