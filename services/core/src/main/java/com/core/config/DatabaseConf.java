package com.core.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DatabaseConf {
	
	//@Autowired
	private ConnectionSet connectionSet;
	
	@Value("${spring.application.name}")
	private String appName;
	
	//@Bean
	public DataSource dataSource() {
		HikariConfig hikariConfig = new HikariConfig();
		hikariConfig.setDriverClassName(connectionSet.getJdbcDriver());
		hikariConfig.setJdbcUrl(connectionSet.getJdbcString() + "&ApplicationName=" + appName + "_service");
		hikariConfig.setUsername(connectionSet.getJdbcUser());
		hikariConfig.setPassword(connectionSet.getJdbcPassword());
		hikariConfig.setMinimumIdle(connectionSet.getJdbcMinPoolIdle());
		hikariConfig.setMaximumPoolSize(connectionSet.getJdbcMaxPoolSize());
		hikariConfig.setPoolName("main");
		return new HikariDataSource(hikariConfig);
	}

}
