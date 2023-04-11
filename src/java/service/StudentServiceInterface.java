/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import model.Signingup;
import model.Students;

/**
 *
 * @author Mer
 */
public interface StudentServiceInterface extends Remote{
    public void saveStudent(Students student) throws RemoteException;
    public void searchStudent(Students student) throws RemoteException;
    public void saveUser(Signingup su) throws RemoteException;
    public void searchUser(Signingup su) throws RemoteException;
}
