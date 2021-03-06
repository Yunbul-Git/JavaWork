package com.controll;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.command.write.Command;
import com.command.write.ListCommand;
import com.command.write.SelectCommand;
import com.command.write.ViewCommand;
import com.command.write.WriteCommand;

@WebServlet("*.do")
public class WriteControll extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
    public WriteControll() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		actionDo(request, response);
	}
	protected void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("actionDo() 호출");
		
		request.setCharacterEncoding("utf-8");
		
		// 컨트롤러는 다음 두개를 선택해야 한다.
		String viewPage = null;		// 어떠한 뷰? --> 페이지
		Command command = null;		// 어떠한 커맨드? --> 어떠한 로직 수행. 
		
		// URL로 부터 URI, ContextPath, Command 분리
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String com = uri.substring(conPath.length());
		
		// 테스트 출력
		System.out.println(uri);
		System.out.println(conPath);
		System.out.println(com);
		
		// 컨트롤러는 커맨드에 따라, 로직을 수행하고
		// 결과를 내보낼 view 를 결정한다
		switch(com) {
		case "/list.do":
			command = new ListCommand();
			command.execute(request, response);
			viewPage = "list.jsp";
			break;
		case "/write.do":
			command = new WriteCommand();
			command.execute(request, response);
			viewPage = "write.jsp";
			break;
		case "/writeOk.do":
			command = new WriteCommand();
			command.execute(request, response);
			viewPage = "writeOk.jsp";
			break;
		case "/view.do":
			command = new ViewCommand();
			command.execute(request, response);
			viewPage = "view.jsp";
			break;
		case "/update.do":
			command = new SelectCommand();
			command.execute(request, response);
			viewPage = "update.jsp";
			break;
		} // end switch
		
		// request 를 위에서 결정된 view 에 forward 해줌.
		if(viewPage != null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
		}
	} // end actionDo()

}
