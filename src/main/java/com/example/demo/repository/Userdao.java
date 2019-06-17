package com.example.demo.repository;

import com.example.demo.entity.UserData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userdao extends CrudRepository<UserData, Integer>{

}
