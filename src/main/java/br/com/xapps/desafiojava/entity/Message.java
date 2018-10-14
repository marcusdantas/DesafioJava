package br.com.xapps.desafiojava.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document
public class Message implements Serializable {
	
	private static final long serialVersionUID = 5464734164036939750L;
	@Id
	private String id;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date date;
	private Input input;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Input getInput() {
		return input;
	}
	public void setInput(Input input) {
		this.input = input;
	}
	
}
