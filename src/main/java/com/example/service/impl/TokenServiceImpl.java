package com.example.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.service.TokenService;

@Service("com.example.service.TokenService")
public class TokenServiceImpl implements TokenService {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(TokenServiceImpl.class);

	@Override
	public void refreshAccessToken() {
		LOGGER.info("refreshAccessToken");
	}

	@Override
	public String getSign() {
		return String.valueOf(System.currentTimeMillis());
	}
}
