package br.com.xapps.desafiojava.exception;

public class MessageNotFoundException extends Exception {
	private static final long serialVersionUID = 3687497446068375417L;

	public MessageNotFoundException(String id) {
		super(id);
	}
}
