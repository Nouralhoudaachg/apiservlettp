package ma.bankati.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/SecondControleur")
public class SecondServelet  extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String page="""
                <!DOCTYPE html>
                   <html>
                        <head>
                              <title>Hello World </title>
                        </head>
                        <body>
                             <h1>Bonjour mes amis ^_^ </h1>
                             <h2> Ceci est une page generee a partir de notre Seconde Servlet </h2>
                                 <ul>
                                 """;
        page +="<li> Protocole:"+request.getProtocol() +"</li>";
        page +="<li> Serveur:"+request.getServerName() +"</li>";
        page+="<li> Port:"+request.getServerPort() +"</li>";
        page +="<li> Methode:"+request.getMethod() +"</li>";
        page +="""
                                  </ul>
                   </body>    
                
                  </html>
                """;

        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        out.println(page);
    }
}
