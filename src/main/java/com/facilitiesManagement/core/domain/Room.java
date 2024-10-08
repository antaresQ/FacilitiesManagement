package com.facilitiesManagement.core.domain;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.Data;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Document(collection = "Rooms")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {
	
	@Id
	private ObjectId id;
	
	private String name;
	
	private Integer roomId;
	
	private RoomType roomType;
	
	private String imageUrl;
	
	private String videoUrl;

	private Integer teacherDesks;
	
	private Integer teacherChairs;
	
	private Integer tabletChairs;
	
	private Integer stackedTabletChairs;
	
	private Integer desks;
	
	private Integer chairs;
	
	private Integer stackedChairs;
	
	@DocumentReference
	private List<Booking> bookings;
}
