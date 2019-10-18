package br.com.samy.helpdesk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.samy.helpdesk.entity.User;

public interface UserRepo extends MongoRepository<User, String> {

	User findByEmail(String email);  
	
}
