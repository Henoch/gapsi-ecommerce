package com.example.service.impl;

import org.springframework.stereotype.Service;

import com.example.dto.ComunDto;
import com.example.service.ComunService;

@Service
public class ComunServiceImpl implements ComunService {

	@Override
	public ComunDto obtnerConfig() {
		
		return new ComunDto("version 0.0.1");
	}

	
}
