/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import java.sql.SQLException;
import java.util.List;
import model.Signingup;
import model.Students;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Mer
 */
public class StudentDAO {
    public void saveStudent(Students student){
        Session sess = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trans = sess.beginTransaction();
        sess.save(student);
        trans.commit();
        sess.close();
    }
    
    public boolean searchStudent(String stid, String passw) {
        Session sess = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trans = sess.beginTransaction();
        Query q = sess.createQuery("FROM Students st WHERE st.stid = :stid AND st.passw = :passw");
        q.setParameter("stid", stid);
        q.setParameter("passw", passw);
        Students student = (Students) q.uniqueResult();
        trans.commit();
        return student !=null;
    }
    
    public Students studentName(String fname) {
        Session sess = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trans = sess.beginTransaction();
        Criteria crit = sess.createCriteria(Students.class);
        crit.add(Restrictions.eq("fname",fname));
        Students student = (Students) crit.uniqueResult();
        trans.commit();
        sess.close();
        return student;
    }
    
     public void saveUser(Signingup su){
        Session sess = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trans = sess.beginTransaction();
        sess.save(su);
        trans.commit();
        sess.close();
    }
     
     public boolean searchUser(String email, String password) {
        Session sess = NewHibernateUtil.getSessionFactory().openSession();
        Transaction trans = sess.beginTransaction();
        Query q = sess.createQuery("FROM Signingup su WHERE su.email = :email AND su.password = :password");
        q.setParameter("email", email);
        q.setParameter("password", password);
        Signingup stu = (Signingup) q.uniqueResult();
        trans.commit();
        return stu !=null;
    }
}       

