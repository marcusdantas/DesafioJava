package br.com.xapps.desafiojava.service;

import java.util.Collection;
import java.util.Optional;

import br.com.xapps.desafiojava.entity.Message;

public interface IMessageService {
	public Collection<Message> findAll();
	public Optional<Message> findById(String id);
	public Message save(Message message);
	public void delete(String id);
}
