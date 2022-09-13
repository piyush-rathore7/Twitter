package com.tweetApp.FSE.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

//import com.tweetApp.FSE.Model.Register;
import com.tweetApp.FSE.Model.Tweet;

public interface TweetRepository extends JpaRepository<Tweet,Integer> {
	
//	public List<Tweet> findByRecordActive(char recordActive);

	//public List<Tweet> findByEmail(String email);
	
	//public Tweet deleteById(int id);
	
	@Query(value = "Select * from Tweet t where t.record_active = ?1", nativeQuery = true)
	public List<Tweet> findByRecordActive(char recordActive);
	
	@Query(value = "Select * from Tweet t where t.email = ?1", nativeQuery = true)
	public List<Tweet> findByEmail(String email);

	@Modifying
	@Query(value = "Delete from Tweet t where t.id = ?1", nativeQuery = true)
	public void deleteById(int id);


}
