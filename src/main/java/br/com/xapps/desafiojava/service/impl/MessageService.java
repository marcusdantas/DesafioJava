package br.com.xapps.desafiojava.service.impl;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.xapps.desafiojava.entity.Message;
import br.com.xapps.desafiojava.repository.IMessageRepository;
import br.com.xapps.desafiojava.service.IMessageService;

@Service
public class MessageService implements IMessageService {

	@Autowired
	private IMessageRepository messageRepository;
	
	@Override
	public Collection<Message> findAll() {
		return this.messageRepository.findAll();
	}

	@Override
	public Optional<Message> findById(String id) {
		return this.messageRepository.findById(id);
	}

	@Override
	public Message save(Message message) {
		return this.messageRepository.save(message);
	}

	@Override
	public void delete(String id) {
		this.messageRepository.deleteById(id);
	}

}
