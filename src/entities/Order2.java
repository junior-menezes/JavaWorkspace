package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;
import model.entities.OrderItem;

public class Order2 {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	private Client cliente;
	private List<OrderItem> items = new ArrayList<>();
	
	public Order2() {
		
	}
	
	public Order2(Date moment, OrderStatus status, Client cliente) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getCliente() {
		return cliente;
	}

	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void addItems(OrderItem items) {
		this.items.add(items);
	}
	
	public double total() {
		double sum = 0.0;
		for (OrderItem item : items) {
			sum += item.subTotal();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Order moment: ");
		builder.append(sdf.format(moment) + "\n");
		builder.append("Order status: ");
		builder.append(status  + "\n");
		builder.append("Cliente: ");
		builder.append(cliente + "\n");
		builder.append("Order items:\n");
		
		for (OrderItem orderItem : items) {
			builder.append(orderItem + "\n");
		}
		
		builder.append("Total Price: ");
		builder.append(String.format("%.2f", total()));
		
		return builder.toString();
	}
	
	
	
}
