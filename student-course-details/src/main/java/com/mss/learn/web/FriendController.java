package com.mss.learn.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mss.learn.model.Friend;
import com.mss.learn.service.FriendService;

@RestController
public class FriendController {

  @Autowired
  FriendService service;

  @RequestMapping(value = "/friend",method=RequestMethod.POST)
	public void addFriend(@RequestBody Friend friend){
    service.addFriend(friend);
  }

  @RequestMapping(value = "/friend/{id}",method=RequestMethod.GET)
	public Friend getFriend(@PathVariable int id){
    return service.getFriend(id);
  }

    @RequestMapping(value = "/friend/{id}",method=RequestMethod.DELETE)
	public void deleteFriend(@PathVariable int id){
    service.deleteFriend(id);
  }

}
