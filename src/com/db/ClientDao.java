package com.db;

import java.util.List;

public interface ClientDao {

	final String selectSql = " SELECT * FROM CLIENT ";
	final String insertSql = " INSERT INTO CLIENT VALUES (?,?,?) ";
	
	public List<Client> selectAll();
	public int getInsert(Client client);
	
}
