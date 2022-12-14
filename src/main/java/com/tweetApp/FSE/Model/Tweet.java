package com.tweetApp.FSE.Model;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//import org.springframework.data.annotation.Id;
@Entity(name="Tweet")
public class Tweet {
	
	@Id
	private int id;
	
	private String tweetDescription;
	
	private String tweetTag;
	
	private String Date;
	
	private String email;
	
	private char recordActive;
	
	@OneToMany(mappedBy = "email", fetch = FetchType.LAZY)
	private List<Reply> reply;

	public void setReply(List<Reply> reply) {
		this.reply = reply;
	}

	public List<Reply> getReply() {
		return reply;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTweetDescription() {
		return tweetDescription;
	}

	public void setTweetDescription(String tweetDescription) {
		this.tweetDescription = tweetDescription;
	}

	public String getTweetTag() {
		return tweetTag;
	}

	public void setTweetTag(String tweetTag) {
		this.tweetTag = tweetTag;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getRecordActive() {
		return recordActive;
	}

	public void setRecordActive(char recordActive) {
		this.recordActive = recordActive;
	}

	@Override
	public String toString() {
		return "Tweet [id=" + id + ", tweetDescription=" + tweetDescription + ", tweetTag=" + tweetTag + ", Date="
				+ Date + ", email=" + email + ", recordActive=" + recordActive + ", reply=" + reply
				+ "]";
	}

	

	
	

	

}
