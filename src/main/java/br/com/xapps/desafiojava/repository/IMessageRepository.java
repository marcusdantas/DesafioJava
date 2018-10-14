package br.com.xapps.desafiojava.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.xapps.desafiojava.entity.Message;

public interface IMessageRepository extends MongoRepository<Message, String> {
	
}
