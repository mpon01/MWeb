package controller;


import dao.StudentDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Students;
import service.StudentService;
import service.StudentServiceInterface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mer
 */

@WebServlet(urlPatterns = "/login")
public class Login extends HttpServlet {
    
    private StudentDAO loginDAO;
    
    public void init(){
        loginDAO = new StudentDAO();
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        response.setContentType("text/HTML");
        try(PrintWriter out = response.getWriter()){
            String email = request.getParameter("email");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Personal Page</title>"); 
                out.println("<style>");
                out.println("body {");
                out.println("background-image:url(./mint.jpeg);");
                out.println("}");
                out.println("#wel {");
                out.println("background-color:white;");
                out.println("opacity:0.75;");
                out.println("text-align:center;");
                out.println("font-family:'Century Gothic', sans-serif;");
                out.println("font-size:32px;");
                out.println("border-radius:10px;");
                out.println("margin:15% 30% 10% 30%;");
                out.println("padding:10% 10% 10% 10%;");
                out.println("}");
                out.println("</style>");
                out.println("</head>");
                out.println("<body>");
                out.println("<div id='wel'>");
                out.println("WELCOME <span style='font-weight:bolder;'> "+email+" </span> TO THE SERVER!");
                out.println("<h2 style=\"border-bottom: black; font-size: 15px; margin-left: 10%\">\n" +
                   "<a href=\"login.html\" style=\"color:black;\"><--Logout</a>\n" +
                   "</h2>");
                out.println("</div>");
                out.println("</body>");
                out.println("</html>");
            }
        
        }
            
    }

