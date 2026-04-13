package com.spring.mvc.data;

public class OrderModel {
	
	
	public String scheduledTime;
	
	public String scheduledDate;
	
	public OrderModel(String scheduledDate, String scheduledTime)
	{
		this.scheduledTime=scheduledTime;
		this.scheduledDate=scheduledDate;
	}
	
	public String getScheduledTime() {
		return scheduledTime;
	}

	@Override
	public String toString() {
		return "OrderModel [scheduledTime=" + scheduledTime + ", scheduledDate=" + scheduledDate + "]";
	}

	public void setScheduledTime(String scheduledTime) {
		this.scheduledTime = scheduledTime;
	}

	public String getScheduledDate() {
		return scheduledDate;
	}

	public void setScheduledDate(String scheduledDate) {
		this.scheduledDate = scheduledDate;
	}


}
