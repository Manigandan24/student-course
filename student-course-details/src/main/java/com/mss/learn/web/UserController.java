package com.mss.learn.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mss.learn.dto.UserDTO;
import com.mss.learn.model.User;
import com.mss.learn.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService service;

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public User getuserbyId(@PathVariable int id) {
		return service.getuserbyId(id);
	}

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public void addUser(@RequestBody User user) {
		service.addUser(user);
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public void deleteeuserbyId(@PathVariable int id) {
		service.deleteUser(id);
	}

	@RequestMapping(value = "/user/frnd/{id}", method = RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public UserDTO selectuserbyId(@PathVariable int id) {
		UserDTO dto= service.selectByUser(id);
		return dto;
	}

}
