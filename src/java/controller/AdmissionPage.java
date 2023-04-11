/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Students;
import service.StudentService;
import service.StudentServiceInterface;

/**
 *
 * @author Mer
 */

@WebServlet(urlPatterns = "/register")
public class AdmissionPage extends HttpServlet {

   @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/HTML");
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try (PrintWriter out = response.getWriter()) {
            String fname = request.getParameter("fname");
            String sname = request.getParameter("sname");
            String dob = request.getParameter("dob");
            Date dateob = formatter.parse(dob);
            String gender = request.getParameter("gender");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            String faculty = request.getParameter("faculty");
            String program = request.getParameter("program");
            String passpic2 = request.getParameter("passpic");
            byte[] passpic = passpic2.getBytes();
            String certificate2 = request.getParameter("certificate");
            byte[] certificate = certificate2.getBytes();
           
            Students student = new Students(fname, sname, dateob, gender, email, phone, faculty, program, passpic, certificate);
            StudentServiceInterface stInt = new StudentService();
            stInt.saveStudent(student);
            
            JavaMail.sendMail(request.getParameter("email"));
            
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Registration Successful!</title>"); 
            out.println("<style>");
            out.println("body {");
            out.println("background-image:url(./mystones1.jpeg);");
            out.println("}");
            out.println("#wel {");
            out.println("background-color:white;");
            out.println("opacity:0.75;");
            out.println("text-align:center;");
            out.println("font-family:'Century Gothic', sans-serif;");
            out.println("font-size:18px;");
            out.println("border-radius:10px;");
            out.println("margin:15% 30% 10% 30%;");
            out.println("padding:10% 10% 10% 10%;");
            out.println("}");
            out.println("#btn {\n" +
            "  position: relative;\n" +
            "  padding: 15px 15px;\n" +
            "  font-size: 1.5rem;\n" +
            "  color: balck;\n" +
            "  border: 2px solid black;\n" +
            "  border-radius: 15px;\n" +
            "  text-shadow: 0 0 15px #9BA17B;\n" +
            "  text-decoration: none;\n" +
            "  text-transform: uppercase;\n" +
            "  letter-spacing: 0.1rem;\n" +
            "  transition: 0.5s;\n" +
            "  z-index: 1;\n" +
            "}\n" +
            "\n" +
            "\n" +
            ".button:hover {\n" +
            "  color: white;\n" +
            "  border: 2px solid black;\n" +
            "  box-shadow: 0 0 0px plum;\n" +
            "}\n" +
            "\n" +
            "#btn::before {\n" +
            "  content: '';\n" +
            "  position: absolute;\n" +
            "  top: 0;\n" +
            "  left: 0;\n" +
            "  width: 100%;\n" +
            "  height: 100%;\n" +
            "  background-color: white;\n" +
            "  z-index: -1;\n" +
            "  transform: scale(0);\n" +
            "  transition: 0.2s;\n" +
            "}\n" +
            "\n" +
            "#btn:hover::before {\n" +
            "  transform: scale(1);\n" +
            "  transition-delay: 0s;\n" +
            "  box-shadow: 0 0 10px sandybrown,\n" +
            "    0 0 30px sandybrown,\n" +
            "    0 0 60px sandybrown;\n" +
            "}");

            out.println("}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div id='wel'>");
            out.println("Thank you <span style='font-weight:bolder;'>"+fname+"</span> For Registering.<br>");
            out.println("You may proceed to log in!<br><br><br>");
            out.println("<a href='login.html'><button id='btn' style='font-family:Century Gothic, sans-serif;'>LOGIN</button></a>");
            out.println("<br>");
            out.println("</div>");
            out.println("</body>");
            out.println("</html>");
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}