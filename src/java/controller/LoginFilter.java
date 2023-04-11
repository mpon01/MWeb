/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.StudentDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 *
 * @author Mer
 */

@WebFilter(urlPatterns = "/login")
public class LoginFilter implements Filter {
    
    private static final boolean debug = true;
    private FilterConfig filterConfig = null;

     private StudentDAO loginto;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        loginto = new StudentDAO();
    }

    private void doBeforeProcessing(ServletRequest request, ServletResponse response)
            throws IOException, ServletException {
                    if (debug) {
                        log("SignupFilter:DoAfterProcessing");
                    }
            }
         
        
    
    
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
                   
           try(PrintWriter out = response.getWriter()){
            String email = request.getParameter("email");
            String passw = request.getParameter("password");
            boolean result = loginto.searchUser(email, passw);
               if(result==true){
                    chain.doFilter(request, response);

            }else{
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Error Page</title>"); 
                    out.println("<style>");
                    out.println("body {");
                    out.println("background-image:url(./mystones1.jpeg);");
                    out.println("}");
                    out.println("#wel {");
                    out.println("background-color:white;");
                    out.println("opacity:0.75;");
                    out.println("text-align:center;");
                    out.println("font-family:'Century Gothic', sans-serif;");
                    out.println("font-size:24px;");
                    out.println("border-radius:10px;");
                    out.println("margin:15% 30% 10% 30%;");
                    out.println("padding:10% 10% 10% 10%;");
                    out.println("}");
                    out.println("</style>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<div id='wel'>");
                    out.println("Invalid ID/Password.<br>");
                    out.println("Try again.<br>");
                    out.println("<a href='login.html'><button>Back to Login</button></a>");
                    out.println("</div>");
                    out.println("</body>");
                    out.println("</html>");
                   
                    doAfterProcessing(request, response);
                    
            }
            
            
        }
    
    }
    
    private void doAfterProcessing(ServletRequest request, ServletResponse response)
            throws IOException, ServletException {
        
                    RequestDispatcher rd=request.getRequestDispatcher("login.html");
                    rd.forward(request, response);
    }
    
    @Override
    public void destroy() {
       
    }
    
    
    public void log(String msg) {
        filterConfig.getServletContext().log(msg);        
    }

 
}



//        if (debug) {
//            log("SignupFilter:DoAfterProcessing");
//        }