package com.springrest.springrest.dao;


import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.entities.load;



@Repository
public interface LoadDao extends JpaRepository<load, Long> {
	
//	@Autowired
//	public static final JdbcTemplate jdbcTemplate = new JdbcTemplate();
//	
	
//	public void createTable() {
//		
//		var query= "CREATE TABLE load(loadId SERIAL PRIMARY KEY, loadingPoint varchar(100) NOT NULL, unloadingPoint varchar(100) NOT NULL, productType varchar(100), truckType varchar(100), noOfTrucks int, weight int, comment varchar(100), shipperId int, date varchar(100) )";
//		int update = this.jdbcTemplate.update(query);
//		System.out.println(update);
//	}


}
