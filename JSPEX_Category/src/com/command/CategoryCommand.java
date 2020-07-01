package com.command;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lec.beans.CategoryDAO;

public class CategoryCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int cnt = 0;
		
		CategoryDAO dao = new CategoryDAO();
		
		StringBuffer message = new StringBuffer();
		String status = "FAIL";
		
		int depth = Integer.parseInt(request.getParameter("depth"));
		
		try {
			cnt = dao.insertBox(depth);
			if(cnt == 0) {
				System.out.println("0 개의 데이터");
			} else {
				status = "OK";
				System.out.println(cnt + " 개의 데이터");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		request.setAttribute("count", cnt);
		System.out.println(cnt);
		request.setAttribute("status", status);
		request.setAttribute("message", message.toString());
		
		
	}

}
