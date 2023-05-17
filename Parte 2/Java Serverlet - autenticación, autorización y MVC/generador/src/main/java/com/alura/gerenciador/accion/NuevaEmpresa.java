package com.alura.gerenciador.accion;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.alura.gerenciador.modelo.DB;
import com.alura.gerenciador.modelo.Empresa;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NuevaEmpresa implements Accion {

	public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		
		
		return "redirect:entrada?accion=ListaEmpresas";
		
		
		//llamar al jsp
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
//		request.setAttribute("empresa", empresa.getNombre());
//		rd.forward(request, response);
	}
	
}
