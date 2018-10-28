/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/oi")
@WebServlet(name="PrimeiraServlet", urlPatterns={"/oi","/ola"})
public class OiMundo extends HttpServlet{
    protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
    PrintWriter objOut = response.getWriter();
    
    //Conteudo Saida
    objOut.print("<html>");
    objOut.print("<head>");
    objOut.print("<title> Testando</title>");
    objOut.print("</head>");
    objOut.print("<body>");
    objOut.print("<h1>Testando Tudo,mas tudo mesmo,ok eu entendi!</h1>");
    objOut.print("</body>");
    objOut.print("</html>");
    }
}
