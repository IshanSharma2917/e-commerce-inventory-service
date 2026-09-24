package com.inventory.inventory_service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="t_inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
    @Column(unique = true)
	private String skucode;
	private Integer quantity;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSkucode() {
		return skucode;
	}
	public void setSkucode(String skucode) {
		this.skucode = skucode;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Inventory() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Inventory [id=" + id + ", skucode=" + skucode + ", quantity=" + quantity + "]";
	}
	public Inventory(long id, String skucode, Integer quantity) {
		super();
		this.id = id;
		this.skucode = skucode;
		this.quantity = quantity;
	}


}
