package Entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import Entities.enums.OrderStatus;

public class Order {
	
	private static DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
	
	private LocalDateTime moment;
	private OrderStatus status;
	private List <OrderItem> listOi = new ArrayList<OrderItem>();
	private Client client;
	
	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrderItem> getListOi() {
		return listOi;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		listOi.add(item);
	}
	public void removeItem(OrderItem item) {
		listOi.remove(item);
	}
	public Double total(){
		double total = 0.0;
		for (OrderItem c: listOi) {
			total += c.subTotal();	
		}
		return total;
		
	}
	
	public String toString() {
		
	
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMARY" + "\n");
		sb.append("Order moment: ");
		sb.append(fmt2.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem c : listOi) {
			sb.append(c + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();

	}
	
	
	
	
	

}
