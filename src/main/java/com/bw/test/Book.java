package com.bw.test;

public class Book {
	
	private Integer id;
	private String bname;
	private Double price;
	private String btime;
	
	private Integer tid;
	
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getBtime() {
		return btime;
	}
	public void setBtime(String btime) {
		this.btime = btime;
	}
	public Book(Integer id, String bname, Double price, String btime) {
		super();
		this.id = id;
		this.bname = bname;
		this.price = price;
		this.btime = btime;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bname=" + bname + ", price=" + price + ", btime=" + btime + "]";
	}
	

}
