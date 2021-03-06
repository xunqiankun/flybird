package com.flybird.web.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flybird.web.demo.repository.DemoRepository;
import com.flybird.web.demo.viewmodel.DemoInfo;
import com.flybird.web.person.Person;

import weixin.popular.api.TokenAPI;

@RestController
@Transactional
public class DemoController {
	@Autowired
	DemoRepository demoRepository;

	@RequestMapping(path = "/demo", method = RequestMethod.GET)
	//@PreAuthorize("hasRole('USER')")
    public Page<DemoInfo> getDemoInfo() {
		
		Page<DemoInfo> L = demoRepository.findById("1", new PageRequest(0, 10, Direction.ASC, "name", "name"));
		for(DemoInfo info:L){
	        System.out.println("Name" +info.getName());
	    }
		return L;
    }
}
