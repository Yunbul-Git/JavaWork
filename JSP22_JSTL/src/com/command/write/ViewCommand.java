package com.command.write;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lec.beans.WriteDAO;
import com.lec.beans.WriteDTO;

public class ViewCommand implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		WriteDAO dao = new WriteDAO(); // 트랜잭션을 수행하는 객체 생성
		WriteDTO [] arr = null;
		
		int uid = Integer.parseInt(request.getParameter("uid"));		
		if(arr == null || arr.length == 0) {
			try {				
				arr = dao.readByUid(uid);
					
				request.setAttribute("view", arr);
				
			} catch (SQLException e) {
				e.printStackTrace();
			}			
		}
	}
}
