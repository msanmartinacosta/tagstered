package com.tagstered.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * @author matias
 *
 */
@Entity
@Table(name = "USER")
public class User {

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	Integer id;

	/**
	 * 
	 */
	@Column(name = "USER_ID", unique = true, nullable = false)
	String userId;
	
	/**
	 * 
	 */
	@Column(name = "TOKEN", unique = true, nullable = false)
	String token;

	/**
	 * 
	 */
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval=true )
	@JoinColumn(name = "ID_USER", referencedColumnName = "ID")
	Collection<Tag> followedTags;

	/**
	 * @return
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return
	 */
	public Collection<Tag> getFollowedTags() {
		return followedTags;
	}

	/**
	 * @param followedTags
	 */
	public void setFollowedTags(Collection<Tag> followedTags) {
		this.followedTags = followedTags;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [userId=" + userId + "]";
	} 
	
	
}		
