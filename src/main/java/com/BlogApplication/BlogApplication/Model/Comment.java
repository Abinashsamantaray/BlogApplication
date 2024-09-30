package com.BlogApplication.BlogApplication.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "post_id" , nullable=false)
	private BlogPost post;
	
	@ManyToOne
	@JoinColumn(name ="author_id",nullable= false)
	private User author;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public BlogPost getPost() {
		return post;
	}

	public void setPost(BlogPost post) {
		this.post = post;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}
	
}
