package com.uniksoft.dao;

import com.uniksoft.hibernate.HibernateUtil;
import com.uniksoft.model.Contact;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ContactDAO {
    public boolean addContact(Contact contact) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Transaction t = null;
        try {
            Session s = sf.openSession();
            t = s.beginTransaction();
            s.persist(contact);
            t.commit();
            return true;
        } catch(Exception e) {
            System.out.println("*** addContact error: " + e.getMessage());
            return false;
        }
    }

    public List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<Contact>();
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Transaction t = null;
        try {
            Session s = sf.openSession();
            t = s.beginTransaction();
            contacts = s.createQuery("from Contact").list();
            t.commit();
        } catch (Exception e) {
            if ( t != null ) t.rollback();
        }
        return contacts;
    }

    public void delete(String id) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Transaction t = null;
        try {
            Session s = sf.openSession();
            t = s.beginTransaction();
            String hql = "delete from Contact c where c.id = :id";
            Query query = s.createQuery(hql);
            query.setInteger("id", Integer.parseInt(id));
            query.executeUpdate();
            t.commit();
        } catch (Exception e) {
            if ( t != null ) t.rollback();
        }
    }

    public Contact getContact(String id) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Transaction t = null;
        Contact contact = null;
        try {
            Session s = sf.openSession();
            t = s.beginTransaction();
            Query query = s.createQuery("from Contact c where c.id = :id");
            query.setInteger("id", Integer.parseInt(id));
            contact = (Contact) query.uniqueResult();
            t.commit();
        } catch (Exception e) {
            if ( t != null ) t.rollback();
        }
        return contact;
    }

    public void updateContact(Contact contact) {
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Transaction t = null;
        try {
            Session s = sf.openSession();
            t = s.beginTransaction();
            s.saveOrUpdate(contact);
            t.commit();
        } catch(Exception e) {
            System.out.println("*** updateContact error: " + e.getMessage());
        }
    }
}
