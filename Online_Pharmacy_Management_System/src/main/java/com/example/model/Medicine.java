package com.example.model;

public class Medicine {
	
	private int medicineId;
    private String medicineName;
    private float price;
    private int quantity;
    private String description;
	/**
	 * @param medicineId
	 * @param medicineName
	 * @param price
	 * @param quantity
	 * @param description
	 */
	public Medicine(int medicineId, String medicineName, float price, int quantity, String description) {
		super();
		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.price = price;
		this.quantity = quantity;
		this.description = description;
	}
	/**
	 * 
	 */
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the medicineId
	 */
	public int getMedicineId() {
		return medicineId;
	}
	/**
	 * @return the medicineName
	 */
	public String getMedicineName() {
		return medicineName;
	}
	/**
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param medicineId the medicineId to set
	 */
	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}
	/**
	 * @param medicineName the medicineName to set
	 */
	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
    
    

}
