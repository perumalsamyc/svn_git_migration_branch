package com.zerone.helpdesk.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Agent Pojo class 
@Entity
@Table(name="agent")
public class Agent { 
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="agent_id")
	private int agentId;
	
	@Column(name="agent_name")
	private String agentName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;

	
	
   public Agent() {
		super();
 	}

	public Agent(String agentName, String email, String phone) {
		super();
		this.agentName = agentName;
		this.email = email;
		this.phone = phone;
	}

	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	
	
}
