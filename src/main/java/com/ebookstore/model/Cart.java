package com.ebookstore.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	String cartId;
	@OneToMany(mappedBy="cart", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	List<CartItem> cartItems;
	@OneToOne
    @JoinColumn(name = "customerId")
    @JsonIgnore
    private Customer customer;
	
	double grandTotal;
	
	public Cart(){
		grandTotal = 0;		
	}

	public Cart(String cartId){
		this.cartId=cartId; 
	}
	
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
