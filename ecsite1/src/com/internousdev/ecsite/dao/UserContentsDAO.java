package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.internousdev.ecsite.dto.UserContentsDTO;
import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;


public class UserContentsDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();

	public UserContentsDTO getUserContents(int id){
		UserContentsDTO dto = new UserContentsDTO();
		String sql="SELECT id,login_id,login_pass,user_name,insert_date,update_date FROM login_user_transaction WHERE id = ? ORDER BY id";

		try{
			PreparedStatement preparedStatement;
		}


	}
}
