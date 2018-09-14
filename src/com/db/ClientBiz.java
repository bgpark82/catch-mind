package com.db;

import java.util.List;

public interface ClientBiz {

	public List<Client> selectAll();
	public int getInsert(Client client);
}
