package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.command.AjaxCategoryCommand;
import com.command.CategoryCommand;
import com.command.Command;

@WebServlet("*.ajax")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Controller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGET");
		ajaxAction(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPOST");
		ajaxAction(request, response);
	}
	
	protected void ajaxAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		request.setCharacterEncoding("UTF-8");
		
		Command command = null;
		
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		System.out.println("cate.ajax");
		
		switch(com) {
		case "/cate.ajax":
			new CategoryCommand().execute(request, response);
			new AjaxCategoryCommand().execute(request, response);
			System.out.println("switch cate.ajax");
			break;
		}
		
	}

}
