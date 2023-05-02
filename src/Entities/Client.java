package Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Client {

	DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private String name;
	private String email;
	private TemporalAccessor data;
	
	public Client() {
	}

	public Client(String name, String email, TemporalAccessor data) {
		super();
		this.name = name;
		this.email = email;
		this.data = data;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TemporalAccessor getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return name + " (" + fmt2.format(data) + ") - " + email;
	}
	
}
