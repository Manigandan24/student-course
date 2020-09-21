package com.mss.learn.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mss.learn.dto.UserDTO;
import com.mss.learn.model.Friend;
import com.mss.learn.model.User;
import com.mss.learn.repo.UserDTORepository;

@Service
public class UserService {

@Autowired
UserDTORepository repository;

public void addUser(User user){
  UserDTO dto=new UserDTO();
  dto.setBalanceStatus(user.getBalanceStatus());
  dto.setEmailId(user.getEmailId());
  dto.setUserId(user.getUserId());
  dto.setUserName(user.getUserName());
  dto.setTotalBalance(user.getTotalBalance());

  Friend friend=new Friend();
  friend.setFriendId(user.getUserId());
  dto.setFriends(Arrays.asList(friend));
  repository.save(dto);
}

public User getuserbyId(int id){
  User user=new User();
  UserDTO dto=repository.findById(id).get();

  user.setBalanceStatus(dto.getBalanceStatus());
  user.setEmailId(dto.getEmailId());
  user.setTotalBalance(dto.getTotalBalance());
  user.setUserId(dto.getUserId());
  user.setUserName(dto.getUserName());

  return user;
}

public void deleteUser(Integer id){
  repository.deleteById(id);
}

public UserDTO selectByUser(int Id) {
	return repository.getOne(Id);
}

}
