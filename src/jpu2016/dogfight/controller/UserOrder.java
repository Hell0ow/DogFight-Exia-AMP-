package jpu2016.dogfight.controller;

public class UserOrder implements IUserOrder {
	
	protected int player;
	protected Order order;

	//CONTRUCTOR
	public UserOrder(int player, Order order) {
		this.player = player;
		this.order = order;
	}

	
	//GETTERS
	public int getPlayer() {
		return player;
	}
	public Order getOrder(){
		return order;
	}
	
	

	
	
	
}
