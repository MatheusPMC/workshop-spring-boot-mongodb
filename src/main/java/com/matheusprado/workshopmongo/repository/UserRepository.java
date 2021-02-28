package com.matheusprado.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.matheusprado.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
