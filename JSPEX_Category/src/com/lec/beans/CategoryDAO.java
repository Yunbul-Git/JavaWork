package com.lec.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import common.D;

public class CategoryDAO {
	
	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public CategoryDAO() {
		
		try {
			Class.forName(D.DRIVER);
			conn = DriverManager.getConnection(D.URL, D.USERID, D.USERPW);
			System.out.println("CategoryDAO()");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}// 생성자
	
	public void close() throws SQLException {
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
	}; // 자원 반납
	
	public int insertBox(CategoryDTO categoryDTO) throws SQLException{
		int cnt = this.insertBox(categoryDTO);
		return cnt;
	}
	
	public int insertBox(int depth) throws SQLException {
		int cnt = 0;
		
		try {
			pstmt = conn.prepareStatement(D.SELECT_BY_DEPTH);

			pstmt.setInt(1, depth);	
			cnt = pstmt.executeUpdate();
			System.out.println(cnt + "insertBox");
			
		} finally {
			close();
		}
		
		return cnt;
	}
	
	public CategoryDTO [] createArray(ResultSet rs) throws SQLException {
		CategoryDTO [] arr = null;
		
		ArrayList<CategoryDTO> list = new ArrayList<CategoryDTO>();
		
		while(rs.next()) {
			int uid = rs.getInt("ca_uid");
			String name = rs.getString("ca_name");
			int depth = rs.getInt("ca_depth");
			int parent = rs.getInt("ca_parent");
			int order = rs.getInt("ca_order");
			
			CategoryDTO dto = new CategoryDTO(uid, name, depth, parent, order);
			
			list.add(dto);
		}
		
		int size = list.size();
		
		if(size == 0) return null;
		
		arr = new CategoryDTO[size];
		list.toArray(arr);
		
		return arr;
	}
	
}
