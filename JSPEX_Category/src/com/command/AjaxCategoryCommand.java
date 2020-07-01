package com.command;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lec.beans.AjaxCategoryList;
import com.lec.beans.CategoryDTO;

public class AjaxCategoryCommand implements Command {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		CategoryDTO [] dtoArr = (CategoryDTO [])request.getAttribute("mycate");
		
		AjaxCategoryList result = new AjaxCategoryList();
		
		
		//int depth = Integer.parseInt(request.getParameter("depth"));
		result.setCount(Integer.parseInt(request.getParameter("count")));
		result.setStatus(request.getParameter("status"));
		//result.setMessage(request.getParameter("message"));
		result.setMessage(dtoArr.length + " 개의 데이터");
		result.setList(Arrays.asList(dtoArr));
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			
			String jsonString = mapper.writerWithDefaultPrettyPrinter()
					.writeValueAsString(result);
			response.setContentType("application/json; charset=utf-8");
			response.getWriter().write(jsonString);
			
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
