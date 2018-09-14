package com.db;

import java.sql.Connection;
import java.util.List;
import static com.db.JDBCTemplete.*;

public class ClientBizImpl extends JDBCTemplete implements ClientBiz {

	Connection con = getConnection();
	ClientDao dao = new ClientDaoImpl(con);
	
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
