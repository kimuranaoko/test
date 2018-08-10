package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.ecsite.dto.ItemContentsDTO;
import com.internousdev.ecsite.util.DBConnector;


public class ItemContentsDAO {


	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();


//	詳細
	public  ItemContentsDTO getItemContents(String item_name) throws SQLException{
		ItemContentsDTO dto = new ItemContentsDTO();
		System.out.println("2");
		String sql="SELECT item_name,item_price,item_stock,insert_date FROM item_info_transaction WHERE item_name = ? ORDER BY item_name ";

		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, item_name);
			ResultSet resultSet = preparedStatement.executeQuery();


			if(resultSet.next()){
				dto.setItemName(resultSet.getString("item_name"));
				dto.setItemPrice(resultSet.getString("item_price"));
				dto.setItemStock(resultSet.getString("item_stock"));
				dto.setInsert_date(resultSet.getString("insert_date"));
			}

			System.out.println(dto.getItemName());
			System.out.println(dto.getItemPrice());
			System.out.println(dto.getItemStock());
			System.out.println(dto.getInsert_date());

		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		System.out.println("3");
		return dto;

	}
}
