package com.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties(prefix = "pool")
public class ConnectionSet {
	private static int DEFAULT_MIN_POOL_IDLE = 1;
	private static int DEFAULT_MAX_POOL_SIZE = 3;

	private String jdbcDriver;
	private String jdbcString;
	private String jdbcUser;
	private String jdbcPassword;
	private int jdbcMinPoolIdle = DEFAULT_MIN_POOL_IDLE;
	private int jdbcMaxPoolSize = DEFAULT_MAX_POOL_SIZE;

}
