package com.viu.assignment;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.viu.assignment.model.HotelRoom;

public class JournelListConverter {

	@SuppressWarnings("deprecation")
	public List<HotelRoom> convertToJournelFile(PrintWriter jwriter) {
		List<HotelRoom> hotelRoomsList = new ArrayList<>();
		HotelRoom hotelRoom = new HotelRoom();
		hotelRoom.setName("Jason Man");
		hotelRoom.setCheckInTime(new Date(2016, 01, 19, 8, 00));
		hotelRoom.setRoomNumber(103);
		hotelRoomsList.add(hotelRoom);
		HotelRoom hotelRoom1 = new HotelRoom();
		hotelRoom1.setName("Jim Steven");
		hotelRoom1.setCheckInTime(new Date(2016, 01, 19, 16, 00));
		hotelRoom1.setRoomNumber(201);
		hotelRoomsList.add(hotelRoom1);
		HotelRoom hotelRoom2 = new HotelRoom();
		hotelRoom2.setName("Sue Wilson");
		hotelRoom2.setCheckInTime(new Date(2016, 01, 20, 9, 00));
		hotelRoom2.setRoomNumber(306);
		hotelRoomsList.add(hotelRoom2);
		HotelRoom hotelRoom3 = new HotelRoom();
		hotelRoom3.setName("Justin Pack");
		hotelRoom3.setCheckInTime(new Date(2016, 01, 22, 11, 00));
		hotelRoom3.setRoomNumber(208);
		hotelRoomsList.add(hotelRoom3);
		HotelRoom hotelRoom4 = new HotelRoom();
		hotelRoom4.setName("Ken Swanson");
		hotelRoom4.setCheckInTime(new Date(2016, 01, 28, 7, 00));
		hotelRoom4.setRoomNumber(107);
		hotelRoomsList.add(hotelRoom4);
		HotelRoom hotelRoom5 = new HotelRoom();
		hotelRoom5.setName("Ann Yan");
		hotelRoom5.setCheckInTime(new Date(2016, 01, 30, 18, 00));
		hotelRoom5.setRoomNumber(202);
		hotelRoomsList.add(hotelRoom5);
		
		for (HotelRoom room : hotelRoomsList) {
			jwriter.println(getDateFormatterUtil(room.getCheckInTime())+"  "+room.getCheckInTime().getHours()+":"+room.getCheckInTime().getMinutes()+
					"   RM"+room.getRoomNumber()+"  "+room.getName());

					
		}
		return hotelRoomsList;
	}
	
	private StringBuilder getDateFormatterUtil(Date date){
		return new StringBuilder().append(date.getMonth()).append("/").append(date.getDate()).append("/").append(date.getYear());
		
	}

}

