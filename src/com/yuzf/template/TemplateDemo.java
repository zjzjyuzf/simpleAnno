package com.yuzf.template;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class TemplateDemo {

	//删除
	
	
	
	//修改
	@Test
	public void update() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/ssm");
		dataSource.setUsername("root");
		dataSource.setPassword("yuzf");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		String sql = "update user set username=?,password=? where user.id = ?";
		
		int rows = jdbcTemplate.update(sql,"james","lebron",2);
		
		
		System.out.println(rows);
		
	}
	
	
	//添加
	@Test
	public void add() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/ssm");
		dataSource.setUsername("root");
		dataSource.setPassword("yuzf");
		
		JdbcTemplate template = new JdbcTemplate(dataSource);
		
//		String sql = "insert into user values('dwyane','wade')";
		
		String sql = "insert into user(username,password) values(?,?)";
		
		int rows = template.update(sql, "dwyane","wade");
		System.out.println(rows);
				
		
		
	}
	
	//查询
	//1.查询记录数
	@Test
	public void select1() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/ssm");
		dataSource.setUsername("root");
		dataSource.setPassword("yuzf");
		
		JdbcTemplate template = new JdbcTemplate(dataSource);
		
		String sql = "select count(*) from user";
		
		int rows = template.queryForObject(sql, Integer.class);
		
		System.out.println(rows);
		
		
	}
	
	//1.查询对象
	@Test
	public void select2() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/ssm");
		dataSource.setUsername("root");
		dataSource.setPassword("yuzf");
		
		JdbcTemplate template = new JdbcTemplate(dataSource);
		
		String sql = "select * from user where user.password = ?";
		
		User user = (User) template.queryForObject(sql, new RowMapper<User>() {

			@Override
			public User mapRow(ResultSet rs, int num) throws SQLException {
				String username = rs.getString("username");
				String password = rs.getString("password");
				User user = new User();
				user.setUsername(username);
				user.setPassword(password);
				return user;
			}}, "123");
		
		System.out.println(user);
			
			
		}
	
}
