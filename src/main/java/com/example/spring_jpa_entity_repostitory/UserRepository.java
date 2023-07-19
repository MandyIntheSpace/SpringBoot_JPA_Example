package com.example.spring_jpa_entity_repostitory;

import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository <User, Integer>{

}
