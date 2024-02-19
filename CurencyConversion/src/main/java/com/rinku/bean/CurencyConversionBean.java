package com.rinku.bean;

import java.math.BigDecimal;

public class CurencyConversionBean {

	private Integer id;
	private String from;
	private String to;
	private BigDecimal quantity;
	private BigDecimal exchangeRate;
	private BigDecimal totalCalcAmount;
	private Integer port;
	
	public CurencyConversionBean() {
		
	}
	
	public CurencyConversionBean(Integer id, String from, String to, BigDecimal quantity, BigDecimal exchangeRate,
			BigDecimal totalCalcAmount, Integer port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.exchangeRate = exchangeRate;
		this.totalCalcAmount = totalCalcAmount;
		this.port = port;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}
	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	public BigDecimal getTotalCalcAmount() {
		return totalCalcAmount;
	}
	public void setTotalCalcAmount(BigDecimal totalCalcAmount) {
		this.totalCalcAmount = totalCalcAmount;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	
	
}
