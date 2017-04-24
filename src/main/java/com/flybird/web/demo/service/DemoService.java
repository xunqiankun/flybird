package com.flybird.web.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.flybird.web.demo.repository.DemoRepository;
import com.flybird.web.demo.viewmodel.DemoInfo;

@Service
public class DemoService {

	@Autowired
	DemoRepository demoRepository;
	
}
