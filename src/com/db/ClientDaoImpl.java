package com.db;

import java.sql.Connection;
import java.util.List;

public class ClientDaoImpl implements ClientDao {

	Connection con;
	
	public ClientDaoImpl(Connection con) {
		this.con = con;
	}
	
	@Override
	public List<Client> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getInsert(Client client) {
		// TODO Auto-generated method stub
		return 0;
	}

}
