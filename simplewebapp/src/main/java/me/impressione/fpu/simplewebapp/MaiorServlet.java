package me.impressione.fpu.simplewebapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/maior")
public class MaiorServlet extends HttpServlet  {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int x = Integer.parseInt(req.getParameter("x"));
		int y = Integer.parseInt(req.getParameter("y"));
		PrintWriter writer = resp.getWriter();
		if(x == y){
			writer.write("Os valores são iguais");
		}else if(x > y){
			writer.write("O maior valor é: " + x);
		}else{
			writer.write("O menor valor é: " +  y);
		}
		
	}


}
