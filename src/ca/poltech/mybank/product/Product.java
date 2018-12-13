package ca.poltech.mybank.product;
import java.util.Date;
import java.util.UUID;


public class Product implements Comparable<Product> {
 	
	public static int PRODUCT_STATUS_ACTIVE = 1;
	public static int PRODUCT_STATUS_INACTIVE = 0;
 	
	protected String id;
	protected Date creationDate;
	protected Date lastUpdate;
	protected int status;
	protected double serviceFeeInterval;
	protected double serviceFee;
 	
	
	public Product(Date creationDate, double serviceFeeInterval, double serviceFee) {
		super();
		this.id = UUID.randomUUID().toString();
		this.creationDate = creationDate;
		this.lastUpdate = new Date();
		this.status = PRODUCT_STATUS_ACTIVE;
		this.serviceFee = serviceFee;
	
	}
 	
	
	
 	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public Date getCreationDate() {
		return creationDate;
	}



	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}



	public Date getLastUpdate() {
		return lastUpdate;
	}



	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}



	public int getStatus() {
		return status;
	}



	public void setStatus(int status) {
		this.status = status;
	}



	public double getServiceFeeInterval() {
		return serviceFeeInterval;
	}



	public void setServiceFeeInterval(double serviceFeeInterval) {
		this.serviceFeeInterval = serviceFeeInterval;
	}



	public double getServiceFee() {
		return serviceFee;
	}



	public void setServiceFee(double serviceFee) {
		this.serviceFee = serviceFee;
	}

	@Override
	public String toString() {
		
		return "Product [id=" + id + ", creationDate=" + creationDate + ", lastUpdate=" + lastUpdate + ", status="
				+ status + ", serviceFeeInterval=" + serviceFeeInterval + ", serviceFee=" + serviceFee + "]";
	}
 	@Override
	public int compareTo(Product o) {
		if (this.getCreationDate().before(o.getCreationDate())) {
			return -1;
		}
		if (this.getCreationDate().after(o.getCreationDate())) {
			return 1;
		}
		return 0;
	}
}

	