package com.cts.ecart.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cts.ecart.model.Product;

@Repository
public class ProductDaoImpl {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// fetching single row
	public Map<String, Object> findById(int productId) {
		String q1 = "select * from product where id=?";
		Map<String, Object> product = jdbcTemplate.queryForMap(q1, productId);
		return product;
	}
	// fetch all records
	public List<Map<String, Object>> fetchAll(){
		String q2="select * from product";
		List<Map<String, Object>> products = jdbcTemplate.queryForList(q2);
		return products;
	}
	

	// Domain objects
	//1. RowMapper
	
	public List<Product> findAll(){
		
		return jdbcTemplate.query("select * from product", new RowMapperDemo());
	
	}
	
	public Product findProductById(int productId) {
		return jdbcTemplate.queryForObject("select * from product where id=?", new RowMapperDemo(),productId);
	}
	
	//2.ResultSetExtractor
	
	public List<Product> listAllProducts(){
		return jdbcTemplate.query("select * from product", new ResultSetExtractorDemo());
	}
	
	
	// DML operations
	// save new product
	public void save(Product product) {
		String q3="insert into product values(?,?,?,?)";
		int count = jdbcTemplate.update(q3,product.getId(),product.getName(),product.getPrice(),product.getDescription());
		System.out.println(count+" rows effcted");
	}
	
	
	
} // end of main method class

class ResultSetExtractorDemo implements ResultSetExtractor<List<Product>>{
	@Override
	public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		List<Product> prods=new ArrayList<>();
		
		while(rs.next()) {
			Product prod=new Product();
			prod.setId(rs.getInt("id"));
			prod.setName(rs.getString("name"));
			prod.setPrice(rs.getDouble("price"));
			prod.setDescription(rs.getString("description"));
			prods.add(prod);
			
		}
		return prods;
	}
}





class RowMapperDemo implements RowMapper<Product>{
	
	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Product prod=new Product();
		prod.setId(rs.getInt("id"));
		prod.setName(rs.getString("name"));
		prod.setPrice(rs.getDouble("price"));
		prod.setDescription(rs.getString("description"));
		
		return prod;
	}
	
}












