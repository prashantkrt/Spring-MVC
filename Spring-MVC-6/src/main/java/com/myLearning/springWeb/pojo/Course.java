package com.myLearning.springWeb.pojo;

public class Course {

	private Integer id;
	private String name;
	private Double price;
	private String duration;

	public Course() {
		super();
	}

	public Course(Integer id, String name, Double price, String duration) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.duration = duration;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", price=" + price + ", duration=" + duration + "]";
	}

}
