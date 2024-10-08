package com.facilitiesManagement.infra.data;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.facilitiesManagement.core.domain.Room;



@Repository	
public interface RoomRepository extends MongoRepository<Room, ObjectId>{
	
	Optional<Room> findRoomByRoomId(Integer roomId); 
}
