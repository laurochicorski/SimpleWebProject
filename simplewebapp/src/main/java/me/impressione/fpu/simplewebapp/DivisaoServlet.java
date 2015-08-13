package me.impressione.fpu.simplewebapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/divisao")
public class DivisaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int x = Integer.parseInt(req.getParameter("x"));
		int y = Integer.parseInt(req.getParameter("y"));
		PrintWriter writer = resp.getWriter();
		if(y > x){
			writer.write(String.format("Não foi possível realizar a divisão, pois o valor " + y + " é maior que " + x + "."));
		}else if(y == 0){
			writer.write(String.format("Não foi possível realizar uma divisão por 0."));
		}else{
			writer.write(String.format("O resultado desta divisão é "+ x / y));
		}
	}
}
