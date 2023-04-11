/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dao.StudentDAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import model.Signingup;
import model.Students;

/**
 *
 * @author Mer
 */
public class StudentService extends UnicastRemoteObject implements StudentServiceInterface{
    public StudentService() throws RemoteException{
        super();
    }

    @Override
    public void saveStudent(Students student) throws RemoteException {
        StudentDAO stDAO = new StudentDAO();
        stDAO.saveStudent(student);
    }

    @Override
    public void searchStudent(Students student) throws RemoteException {
//        StudentDAO stDAO = new StudentDAO();
//        stDAO.searchStudent(stid, password);
    }
    
   
    
    @Override
    public void saveUser(Signingup su) throws RemoteException {
        StudentDAO sud = new StudentDAO();
        sud.saveUser(su);
    }

    @Override
    public void searchUser(Signingup su) throws RemoteException {
 //      StudentDAO sud = new StudentDAO();
 //      sud.searchUser();
    }
    
}
