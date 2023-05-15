package com.alura.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NuevaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Nueva Empresa registrada");
		String nombre_empresa = request.getParameter("nombre");
		String paramFechaAbertura = request.getParameter("fecha");
		Empresa empresa = new Empresa();
		empresa.setNombre(nombre_empresa);
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date fechaAbertura = sdf.parse(paramFechaAbertura);
			empresa.setFechaAbertura(fechaAbertura);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		
		
		DB baseDeDatos = new DB();
		baseDeDatos.agregarEmpresa(empresa);
		
		
		response.sendRedirect("listaEmpresas");
		
		
		//llamar al jsp
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
//		request.setAttribute("empresa", empresa.getNombre());
//		rd.forward(request, response);
//		
	}

}
