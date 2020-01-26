package com.zerone.helpdesk.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.zerone.helpdesk.models.Agent;

//Repository for Agent
@Repository
public interface AgentRepository extends JpaRepository<Agent,Long> {

	@Query(value = "select * from agent", 
			  nativeQuery = true)
	List<Agent> findAllAgent();
	
}
