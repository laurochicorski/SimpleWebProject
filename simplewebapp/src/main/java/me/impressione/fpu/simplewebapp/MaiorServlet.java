package me.impressione.fpu.simplewebapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/maior") 
public class MaiorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		if(req.getParameter("x") == "" || req.getParameter("y") == ""){
			writer.write(String.format("Preenche os dois números"));
			
		}else{
			int x = Integer.parseInt(req.getParameter("x"));
			int y = Integer.parseInt(req.getParameter("y"));
			if(y == x){
				writer.write(String.format("Os números são iguais"));
			}else if(x > y){
				writer.write(String.format("O número " + x + " é maior que " + y));
			}else{
				writer.write(String.format("O número " + y + " é maior que " + x));
			}
		}
	}
}
