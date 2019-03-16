package model;

import java.util.Date;

public class Order {

	Integer codOrder;
	Date date;
	Float finalPrice;
	String clientName;
	String adress;

	public Integer getCodOrder() {
		return codOrder;
	}

	public void setCodOrder(Integer codOrder) {
		this.codOrder = codOrder;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Float getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(Float finalPrice) {
		this.finalPrice = finalPrice;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

}
