/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 *
 * @author Mer
 */
@Entity
@Table(name="students"
    ,schema="public" )
public class Students implements Serializable{
    private String fname;
    private String sname;
    private Date dob;
    private String gender;
    @Id
    private String email;
    private String phone;
    private String faculty;
    private String program;
    private byte[] passpic;
    private byte[] certificate;

    public Students() {
    }

    public Students(String fname, String sname, Date dob, String gender, String email, String phone, String faculty, String program, byte[] passpic, byte[] certificate) {
        this.fname = fname;
        this.sname = sname;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
        this.faculty = faculty;
        this.program = program;
        this.passpic = passpic;
        this.certificate = certificate;
    }


    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public byte[] getPasspic() {
        return passpic;
    }

    public void setPasspic(byte[] passpic) {
        this.passpic = passpic;
    }

    public byte[] getCertificate() {
        return certificate;
    }

    public void setCertificate(byte[] certificate) {
        this.certificate = certificate;
    }

    

    
    
    

    
}
