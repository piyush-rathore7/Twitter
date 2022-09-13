package com.tweetApp.FSE.Repository;

//import java.util.List;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tweetApp.FSE.Model.Register;

public interface RegisterRepository extends JpaRepository<Register,Integer> {
	
//	Optional<Register> findByemail(String email);
//	List<Register> findAll();
	@Query(value = "Select * from Register r where r.email = ?1", nativeQuery = true)
	Optional<Register> findByemail(String email);

}
