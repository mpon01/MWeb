/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Signingup;
import service.StudentService;
import service.StudentServiceInterface;

/**
 *
 * @author Mer
 */
@WebServlet(urlPatterns = "/signup")
public class Signup extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/HTML");
        try{
            String fullname = request.getParameter("fullname");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
           
            Signingup su = new Signingup(fullname, email, password);
            StudentServiceInterface ssi = new StudentService();
            ssi.saveUser(su);
            
            JavaMail.sendMail(request.getParameter("email"));

        }catch(Exception ex){
            ex.printStackTrace();
        }
        
         response.sendRedirect("admissionpage.html");
         
    }
}
