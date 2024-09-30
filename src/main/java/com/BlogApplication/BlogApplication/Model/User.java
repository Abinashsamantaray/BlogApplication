package com.BlogApplication.BlogApplication.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id ;
	private String username;
	private String email;
	private String password;
	
	@OneToMany(mappedBy="author" , cascade = CascadeType.ALL)
	private List<BlogPost> posts;
	
	
	public long getId() {
		return id;
	}
	public List<BlogPost> getPosts() {
		return posts;
	}
	public void setPosts(List<BlogPost> posts) {
		this.posts = posts;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
