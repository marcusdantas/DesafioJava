package br.com.xapps.desafiojava.controller.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.com.xapps.desafiojava.exception.MessageNotFoundException;

@ControllerAdvice
public class MessageNotFoundAdvice {
	@ResponseBody
	@ExceptionHandler(MessageNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public String messageNotFoundHandler(MessageNotFoundException eNf) {
		return eNf.getMessage();
	}
}
