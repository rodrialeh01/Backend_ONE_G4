package com.alura.gerenciador.servlet;

import java.io.IOException;

import com.alura.gerenciador.accion.Accion;
import com.alura.gerenciador.accion.EliminarEmpresa;
import com.alura.gerenciador.accion.ListaEmpresas;
import com.alura.gerenciador.accion.ModificarEmpresa;
import com.alura.gerenciador.accion.MostrarEmpresa;
import com.alura.gerenciador.accion.NuevaEmpresa;
import com.alura.gerenciador.accion.NuevaEmpresaForm;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//@WebServlet(urlPatterns="/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAccion = request.getParameter("accion");
		/*HttpSession sesion = request.getSession();
		Boolean esUnUsuarioNoLogueado = sesion.getAttribute("loginUsuario")==null;
		Boolean esUnaAccionProtegida = !(paramAccion.equals("Login") || paramAccion.equals("FormLogin"));
		
		if(esUnUsuarioNoLogueado && esUnaAccionProtegida) {
			response.sendRedirect("entrada?accion=FormLogin");
			return;
		}*/
		
		String nombreDeClase = "com.alura.gerenciador.accion." + paramAccion;
		
		String nombre;
		
		try {
			Class clase = Class.forName(nombreDeClase);
			Accion accion = (Accion) clase.newInstance();
			nombre = accion.ejecutar(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException
				| IOException e) {
			throw new ServletException(e);
		}
		
		String[] tipoYDireccion = nombre.split(":");
		
		if(tipoYDireccion[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/"+tipoYDireccion[1]);
			rd.forward(request, response);
		}else {
			response.sendRedirect(tipoYDireccion[1]);
		}
		
		/*String nombre = null;
		switch(paramAccion) {
			case "ListaEmpresas":
				ListaEmpresas accion = new ListaEmpresas();
				nombre = accion.ejecutar(request, response);
				break;
			case "MostrarEmpresa":
				MostrarEmpresa accion2 = new MostrarEmpresa();
				nombre = accion2.ejecutar(request, response);
				break;
			case "EliminarEmpresa":
				EliminarEmpresa accion3 = new EliminarEmpresa();
				nombre = accion3.ejecutar(request, response);
				break;
			case "ModificarEmpresa":
				ModificarEmpresa accion4 = new ModificarEmpresa();
				nombre = accion4.ejecutar(request, response);
				break;
			case "NuevaEmpresa":
				NuevaEmpresa accion5 = new NuevaEmpresa();
				nombre = accion5.ejecutar(request, response);
				break;
			case "NuevaEmpresaForm":
				NuevaEmpresaForm accion6 = new NuevaEmpresaForm();
				nombre = accion6.ejecutar();
				break;
		}*/
		
		
	}

}
