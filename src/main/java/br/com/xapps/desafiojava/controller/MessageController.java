package br.com.xapps.desafiojava.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.xapps.desafiojava.entity.Message;
import br.com.xapps.desafiojava.exception.MessageNotFoundException;
import br.com.xapps.desafiojava.service.IMessageService;

@RestController
@RequestMapping(path = "/message")
public class MessageController {
	@Autowired
	private IMessageService messageService;
	
	@GetMapping
	public ResponseEntity<Collection<Message>> findAll(){
		return ResponseEntity.ok(this.messageService.findAll());
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Message> findById(@PathVariable(name="id") String id) throws MessageNotFoundException{
		Optional<Message> retorno = this.messageService.findById(id);
		if(! retorno.isPresent()) {
			throw new MessageNotFoundException(id);
		}
		return ResponseEntity.ok(retorno.get());
	}
	
	@PostMapping
	public ResponseEntity<Message> insert(@RequestBody Message message){
		message.setId(null);
		return ResponseEntity.ok(this.messageService.save(message));
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<Message> update(@PathVariable(name="id") String id, @RequestBody Message message){
		message.setId(id);
		return ResponseEntity.ok(this.messageService.save(message));
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Boolean> delete(@PathVariable(name="id") String id) {
		this.messageService.delete(id);
		return ResponseEntity.ok(Boolean.TRUE);
	}

}
