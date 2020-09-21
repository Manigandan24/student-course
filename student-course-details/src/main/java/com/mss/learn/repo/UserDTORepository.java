package com.mss.learn.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.learn.dto.UserDTO;

@Repository
public interface UserDTORepository extends JpaRepository<UserDTO, Integer> {

  //@Query(value="select * from UserDTO u where u.user_Id=1",nativeQuery = true)
  UserDTO getOne(Integer id);
}
