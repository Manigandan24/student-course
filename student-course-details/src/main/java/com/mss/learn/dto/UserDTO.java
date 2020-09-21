package com.mss.learn.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Fetch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mss.learn.model.Friend;
@Entity
public class UserDTO implements Serializable{

	private final static long serialVersionUID = -1L;
	@Id
	private int userId;
	private String userName;
	private String emailId;
	private double totalBalance;
	private String balanceStatus;
	@JsonIgnoreProperties
	@OneToMany(targetEntity=Friend.class,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Friend> friends=new ArrayList<Friend>();
	public UserDTO() {
		super();
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public double getTotalBalance() {
		return totalBalance;
	}
	public void setTotalBalance(double totalBalance) {
		this.totalBalance = totalBalance;
	}
	public String getBalanceStatus() {
		return balanceStatus;
	}
	public void setBalanceStatus(String balanceStatus) {
		this.balanceStatus = balanceStatus;
	}
	public List<Friend> getFriends() {
		return friends;
	}
	public void setFriends(List<Friend> friends) {
		this.friends = friends;
	}
	public UserDTO(int userId, String userName, String emailId, double totalBalance, String balanceStatus) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
		this.totalBalance = totalBalance;
		this.balanceStatus = balanceStatus;
	}
	
	
	
}
