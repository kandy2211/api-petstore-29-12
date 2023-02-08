package com.pojo;

import java.util.Date;

public class IdOutput {
	
	    public int id;
	    public int petId;
	    public String quantity;
	    public Date shipDate;
	    public String status;
	    public boolean complete;
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getPetId() {
			return petId;
		}
		public void setPetId(int petId) {
			this.petId = petId;
		}
		public String getQuantity() {
			return quantity;
		}
		public void setQuantity(String quantity) {
			this.quantity = quantity;
		}
		public Date getShipDate() {
			return shipDate;
		}
		public void setShipDate(Date shipDate) {
			this.shipDate = shipDate;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public boolean isComplete() {
			return complete;
		}
		public void setComplete(boolean complete) {
			this.complete = complete;
		}
	    
	}


