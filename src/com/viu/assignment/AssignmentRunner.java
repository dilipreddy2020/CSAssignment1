package com.viu.assignment;

import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

import com.viu.assignment.model.HotelRoom;

public class AssignmentRunner {
	public static void main(String[] args) {
		try {
			List<HotelRoom> hotelRoomList;
			PrintWriter writer;
			MasterFileConverter masterFileConverter=new MasterFileConverter();
			writer=new PrintWriter("MasterFile.txt");
			hotelRoomList=masterFileConverter.convertToMasterFile(writer);
			writer.close();
			JournelListConverter jConverter=new JournelListConverter();
			writer=new PrintWriter("Journel.txt");
			hotelRoomList.addAll(jConverter.convertToJournelFile(writer));
			writer.close();
			writer=new PrintWriter("MergeFile.txt");
			Collections.sort(hotelRoomList);
			masterFileConverter.printWriterStream(writer, hotelRoomList);
			writer.close();
			
			
		} catch (Exception e) {
			System.out.println("System ERROR..!!");
			// TODO: handle exception
		}
		System.out.println("DONE!");
		
		
	}

}
