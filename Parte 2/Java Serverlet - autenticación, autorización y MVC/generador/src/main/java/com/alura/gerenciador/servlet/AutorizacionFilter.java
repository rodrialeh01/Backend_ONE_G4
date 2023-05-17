package com.alura.gerenciador.servlet;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//@WebFilter(urlPatterns="/entrada")
public class AutorizacionFilter implements Filter {

	public void doFilter(ServletRequest servletrequest, ServletResponse servletresponse, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest) servletrequest;
		HttpServletResponse response = (HttpServletResponse) servletresponse;
		
		String paramAccion = request.getParameter("accion");		
		HttpSession sesion = request.getSession();
		Boolean esUnUsuarioNoLogueado = sesion.getAttribute("loginUsuario")==null;
		Boolean esUnaAccionProtegida = !(paramAccion.equals("Login") || paramAccion.equals("FormLogin"));
		
		if(esUnUsuarioNoLogueado && esUnaAccionProtegida) {
			response.sendRedirect("entrada?accion=FormLogin");
			return;
		}
		chain.doFilter(request, response);
	}

}
