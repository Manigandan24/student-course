package com.mss.learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mss.learn.model.Friend;
import com.mss.learn.repo.FriendRepository;

@Service
public class FriendService {

  @Autowired
  FriendRepository repository;

    public void addFriend(Friend friend){
    repository.save(friend);
  }

  public Friend getFriend(Integer id){

    return repository.findById(id).get();
  }

  public void deleteFriend(Integer id){
    repository.deleteById(id);
  }
}