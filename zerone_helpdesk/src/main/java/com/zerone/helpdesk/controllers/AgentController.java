package com.zerone.helpdesk.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zerone.helpdesk.models.Agent;
import com.zerone.helpdesk.repository.AgentRepository;

@RestController
@RequestMapping("/agent")
public class AgentController {

	@Autowired
	AgentRepository agentRepository;
	
	@GetMapping("/test")
	public String test() {
		return "Success";
	}
	
	@GetMapping("/getAgent")
	public List<Agent> getAgent() {
		 Agent agent=new Agent("perumal","test@mail.com","1234567");
		 agentRepository.save(agent);
		 List<Agent> agentList= agentRepository.findAllAgent();
		 
		 
		 
		 return agentList; 
	}
	
}
