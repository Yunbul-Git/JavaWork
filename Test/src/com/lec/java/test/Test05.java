package com.lec.java.test;

import java.util.Date;

public class Test05 {

	public static void main(String[] args) {

	}//end main

}//end class

class TicketReservation {
	int uid;
	int movieId;
	int seatId;
	Date regDate;
	// TicketReservation 기본생성자
	public TicketReservation() {}
	// TicketResvervation 매개변수 있는 생성자
	public TicketReservation(int uid, int movieId, int seatId, Date regDate) {
		super();
		this.uid = uid;
		this.movieId = movieId;
		this.seatId = seatId;
		this.regDate = regDate;
	}//end TicketReservation
	
	// getter & setter
	
	public int getUid() {return uid;}
	public void setUid(int uid) {this.uid = uid;}
	
	public int getMovieId() {return movieId;}
	public void setMovieId(int movieId) {this.movieId = movieId;}
	
	public int getSeatId() {return seatId;}
	public void setSeatId(int seatId) {this.seatId = seatId;}
	
	public Date getRegDate() {return regDate;}
	public void setRegDate(Date regDate) {this.regDate = regDate;}
	
}//end class







