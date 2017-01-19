package com.javier.clase.number.one;

public class Customer {

	private String name;
	private int age;
	private boolean sex;
	private double latitute;
	private float price;
	private long longitude;
	
	public void processAge(){
		int age2 = this.age*2;
		System.out.println("Age x2 =="+ age2);
	}
	
	public int getValueBySex(boolean sexParameter){
		this.sex = sexParameter;
		if (sex){
			return 20;
		}else{
			return 50;
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public double getLatitute() {
		return latitute;
	}

	public void setLatitute(double latitute) {
		this.latitute = latitute;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public long getLongitude() {
		return longitude;
	}

	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}
	
	

	
	
}
