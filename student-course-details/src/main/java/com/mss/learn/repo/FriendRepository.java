package com.mss.learn.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.learn.model.Friend;

@Repository
public interface FriendRepository extends JpaRepository<Friend, Integer>{

	
}
