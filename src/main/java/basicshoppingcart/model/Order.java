package basicshoppingcart.model;

import java.util.Date;

public class Order {

	private int orderCod;
	private Date date;
	private float finalPrice;
	private String clientName;
	private String address;

	public int getorderCod() {
		return orderCod;
	}

	public void setorderCod(int orderCod) {
		this.orderCod = orderCod;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public float getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(float finalPrice) {
		this.finalPrice = finalPrice;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getaddress() {
		return address;
	}

	public void setaddress(String address) {
		this.address = address;
	}

}
