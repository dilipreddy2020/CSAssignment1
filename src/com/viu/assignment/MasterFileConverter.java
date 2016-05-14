package com.viu.assignment;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.viu.assignment.model.HotelRoom;

public class MasterFileConverter {

	@SuppressWarnings("deprecation")
	public List<HotelRoom> convertToMasterFile(PrintWriter writer) {
		List<HotelRoom> hotelRoomsList = new ArrayList<>();
		HotelRoom hotelRoom = new HotelRoom();
		hotelRoom.setName("Jack Smith");
		hotelRoom.setCheckInTime(new Date(2016, 01, 11, 5, 00));
		hotelRoom.setRoomNumber(101);
		hotelRoomsList.add(hotelRoom);
		HotelRoom hotelRoom1 = new HotelRoom();
		hotelRoom1.setName("Mary Lee");
		hotelRoom1.setCheckInTime(new Date(2016, 01, 01, 8, 00));
		hotelRoom1.setRoomNumber(102);
		hotelRoomsList.add(hotelRoom1);
		HotelRoom hotelRoom2 = new HotelRoom();
		hotelRoom2.setName("Tom Kelly");
		hotelRoom2.setCheckInTime(new Date(2016, 01, 21, 13, 00));
		hotelRoom2.setRoomNumber(104);
		hotelRoomsList.add(hotelRoom2);
		HotelRoom hotelRoom3 = new HotelRoom();
		hotelRoom3.setName("Ellen Brown");
		hotelRoom3.setCheckInTime(new Date(2016, 01, 16, 6, 00));
		hotelRoom3.setRoomNumber(205);
		hotelRoomsList.add(hotelRoom3);
		HotelRoom hotelRoom4 = new HotelRoom();
		hotelRoom4.setName("Jane Dinger");
		hotelRoom4.setCheckInTime(new Date(2016, 01, 18, 15, 00));
		hotelRoom4.setRoomNumber(106);
		hotelRoomsList.add(hotelRoom4);
		HotelRoom hotelRoom5 = new HotelRoom();
		hotelRoom5.setName("Martin Lisk");
		hotelRoom5.setCheckInTime(new Date(2016, 01, 8, 7, 00));
		hotelRoom5.setRoomNumber(303);
		hotelRoomsList.add(hotelRoom5);
		HotelRoom hotelRoom6 = new HotelRoom();
		hotelRoom6.setName("Tom Kelly");
		hotelRoom6.setCheckInTime(new Date(2016, 01, 02, 13, 00));
		hotelRoom6.setRoomNumber(304);
		hotelRoomsList.add(hotelRoom6);
		HotelRoom hotelRoom7 = new HotelRoom();
		hotelRoom7.setName("Brian Sun");
		hotelRoom7.setCheckInTime(new Date(2016, 01, 15, 9, 00));
		hotelRoom7.setRoomNumber(308);
		hotelRoomsList.add(hotelRoom7);
		Collections.sort(hotelRoomsList);
		printWriterStream(writer, hotelRoomsList);
		return hotelRoomsList;
	}

	public void printWriterStream(PrintWriter writer, List<HotelRoom> hotelRoomsList) {
		for (HotelRoom room : hotelRoomsList) {
			writer.println(
					
					"RM" + room.getRoomNumber() + "    " + room.getName() + "   " + room.getCheckInTime().getHours()
							+ ":" + room.getCheckInTime().getMinutes() + "     " + getDateFormatterUtil(room.getCheckInTime()));
		}
	}
	
	private StringBuilder getDateFormatterUtil(Date date){
		return new StringBuilder().append(date.getMonth()).append("/").append(date.getDate()).append("/").append(date.getYear());
		
	}

}
