package com.db;

public class Client {

	private int pk;
	private String id;
	private String ip;
	
	public Client() {
		
	}

	public Client(int pk, String id, String ip) {
		super();
		this.pk = pk;
		this.id = id;
		this.ip = ip;
	}

	public int getPk() {
		return pk;
	}

	public void setPk(int pk) {
		this.pk = pk;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Override
	public String toString() {
		return "[" + pk + "]\t" + id + "\t" + ip;
	}

	
	
	
}
