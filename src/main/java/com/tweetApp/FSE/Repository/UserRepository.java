package com.tweetApp.FSE.Repository;

//import java.util.List;
//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tweetApp.FSE.Model.Register;
//import com.tweetApp.FSE.Model.Tweet;

public interface UserRepository extends JpaRepository<Register,Integer> {
	
//	Register findByemail(String email);
	
//	Register findById(int id);
	
	@Query(value = "Select * from Register r where r.email = ?1", nativeQuery = true)
	Register findByemail(String email);

	@Query(value = "Select * from Register r where r.id = ?1", nativeQuery = true)
	public Register findById(int id);
}
