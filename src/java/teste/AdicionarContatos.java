/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;
import Controller.Contatos;

/**
 *
 * @author Su
 */
@WebServlet(name="AdicicionarContatos", urlPatterns = {"/adicionarContato"})
public class AdicionarContatos extends HttpServlet {
    Contatos objContatos;
    
    protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
    objContatos = new Contatos();
    objContatos.setNome(request.getParameter("nome"));
    objContatos.setEndereco(request.getParameter("endereco"));
    objContatos.setEmail(request.getParameter("email"));
    objContatos.setDataNascimento(request.getParameter("data"));
    
    PrintWriter objOut = response.getWriter();
    //
    objOut.print("<html>");
    objOut.print("<head>");
    objOut.print("<title> Testando</title>");
    objOut.print("</head>");
    objOut.print("<body>");
    objOut.print("<h1>Nome:</h1>"+objContatos.getNome());
    objOut.print("<h1>Endereco:</h1>"+objContatos.getEndereco());
    objOut.print("<h1>Email:</h1>"+objContatos.getEmail());
    objOut.print("<h1>Data Nascimento:</h1>"+objContatos.getDataNascimento());
    objOut.print("</body>");
    objOut.print("</html>");
    
    }
}
