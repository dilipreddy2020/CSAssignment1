package com.viu.assignment.model;

import java.util.Date;

public class HotelRoom implements Comparable<HotelRoom> {

	private int roomNumber;
	private String name;
	private Date checkInTime;

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(Date checkInTime) {
		this.checkInTime = checkInTime;
	}

	@Override
	public int compareTo(HotelRoom obj) {
		if (this.roomNumber>obj.roomNumber) {
			return 1;
		}else if(this.roomNumber==obj.roomNumber){
			return 0;
		}else{
			return -1;
		}
	}

}
