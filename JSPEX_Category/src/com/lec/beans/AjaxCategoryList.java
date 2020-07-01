package com.lec.beans;

import java.util.List;

public class AjaxCategoryList {
	private int count;
	private String status;
	private String message;
	private List<CategoryDTO> list;
	
	// getter & setter
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<CategoryDTO> getList() {
		return list;
	}
	public void setList(List<CategoryDTO> list) {
		this.list = list;
	}
	
	
}
