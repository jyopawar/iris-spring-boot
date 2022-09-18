package com.jyoti.dao;
import org.springframework.data.repository.CrudRepository;


import org.springframework.stereotype.Repository;


import com.jyoti.model.User;

@Repository
public interface Userepository extends CrudRepository<User,Long>{


}