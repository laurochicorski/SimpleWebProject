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
		String xstr = req.getParameter("x");
		String ystr = req.getParameter("y");
		int x = Integer.parseInt(xstr);
		int y = Integer.parseInt(ystr);
		float resultado = 0;
		PrintWriter writer = resp.getWriter();
		if(x < y){
			writer.write(String.format("Não foi possível fazer a divisão, o valor de Y e maior que o valor de X"));
		}else if(y == 0){
			writer.write(String.format("Não e possível dividir um número por zero"));
		}else{
			resultado = x / y;
			writer.write(String.format("Resultado da divisao %s", resultado));
		}
		
		
		
	}
}
