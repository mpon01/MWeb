/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i18n;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 *
 * @author Mer
 */
//@WebFilter(urlPatterns = "/login")
public class LoginI18N implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        ResourceBundle rsb = ResourceBundle.getBundle("i18n.MessageBundle", request.getLocale());
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"    <meta charset=\"UTF-8\">\n" +
"    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"    <title>Log In</title>\n" +
"    <script defer src=\"login.js\"></script>\n" +
"    <link rel=\"stylesheet\" href=\"login.css\">\n" +
"    \n" +
"    \n" +
"</head>\n" +
"<body>\n" +
"    <div id=\"cont\">\n" +
"        \n" +
"            <div id=\"top\">  ");
        out.println(rsb.getString("SIGN_IN"));
        out.println("</div>\n" +
"        <span style=\"font-family: 'Poppins', sans-serif; text-align: left; font-size: 12px; padding-left: 15%;\"> ");
        out.println(rsb.getString("Please_enter_your_login_credentials"));
        out.println("</span>\n" +
"        <br> <br> <br>\n" +
"        <form id=\"form\" action=\"login\" method=\"POST\" name=\"myform\" onsubmit=\"return (validate());\">   \n" +
"       <div id=\"stud\">\n" +
"            <label for=\"email\"></label>\n" +
"            <input id=\"email\" type=\"text\" name=\"email\" size=\"30\" placeholder=\"E-mail Address\" class=\"mainLoginInput\" required=\"\">\n" +
"       </div>\n" +
"        <br>\n" +
"       <div id=\"passw\">\n" +
"        <label for=\"password\"></label>\n" +
"        <input id=\"password\" type=\"password\" name=\"password\" size=\"30\" placeholder=\"Password\" class=\"mainLoginInput\" required=\"\">\n" +
"        </div>\n" +
"        <br> <br>\n" +
"        <div>\n" +
"            <center>\n" +
"            <button id=\"loginBtn\" type=\"submit\"><span style=\"font-weight: bold; color: white;\">");
        out.println(rsb.getString("LOGIN"));
        out.println("</span></button>\n" +
"            <br> <br> <br>\n" +
"            <table>\n" +
"                <tr id=\"fyp\">\n" +
"                    <td><a href=\"#\" style=\"color:black;\">");
        out.println(rsb.getString("Forgot_your_password?"));
        out.println("<br>\n" +
"                        </a><span style=\"font-style: italic; font-size: 14px;\">");
        out.println(rsb.getString("Contact_portal_admin."));
        out.println("</span><br><br></td>\n" +
"                </tr>\n" +
"                \n" +
"                <tr>\n" +
"                    <td><a href=\"signup.html\" style=\"color: black;\">");
        out.println(rsb.getString("New_User?_Sign_Up_Now!"));
        out.println("</a></td>\n" +
"                </tr>\n" +
"                \n" +
"            </table>\n" +
"            \n" +
"            </center>\n" +
"        </div>\n" +
"        \n" +
"        <br> <br> <br> \n" +
"        </form>\n" +
"       \n" +
"    </div>\n" +
"</body>\n" +
"</html>\n" +
" ");

        
        
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
   
    }
    
}
