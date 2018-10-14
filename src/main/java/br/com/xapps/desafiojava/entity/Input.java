package br.com.xapps.desafiojava.entity;

import java.io.Serializable;

public class Input implements Serializable {
	
	private static final long serialVersionUID = -532302656134344560L;
	
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
