package com.tweetApp.FSE.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//import com.tweetApp.FSE.Model.Register;
import com.tweetApp.FSE.Model.Reply;

public interface ReplyRepository extends JpaRepository<Reply,String> {
	
//	List<Reply> findByTweetId(int tweetId);
	@Query(value = "Select * from Reply r where r.tweet_id = ?1", nativeQuery = true)
	List<Reply> findByTweetId(int tweetId);

}
