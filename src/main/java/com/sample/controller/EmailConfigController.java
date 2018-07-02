package com.sample.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.entities.EmailprofileConfig;
import com.sample.services.EmailConfigService;
import com.sample.util.ResponseData;

@RestController
public class EmailConfigController {

	@Autowired
	EmailConfigService service;

	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	public String samplemethod() {
		return "Welcome to new Spring Project";
	}

	/* Select all records from Email profile config */
	
	@RequestMapping(value = "/get_emailconfig_values", method = RequestMethod.GET)
	public ResponseData getEmailConfigValues() {
		ResponseData response = new ResponseData();
		try {
			service.getemailconfigValues();
			List<EmailprofileConfig> emailprofileconfiglist = new ArrayList<>();
			emailprofileconfiglist = service.getemailconfigValues();
			response.setData(emailprofileconfiglist);
		} catch (Exception e) {
			System.out.println("Inside get_emailconfig_values");
			e.printStackTrace();
		}
		return response;
	}

	/* Save records to Email profile config */
	
	@RequestMapping(value = "/save_emailconfig_values", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseData setEmailConfigValues(@RequestBody final EmailprofileConfig emailprofileconfig,
			ResponseData<List<EmailprofileConfig>> response) {
		List lst = new ArrayList();
		Map valuemap = new HashMap<>();
		service.setEmailprofileConfig(emailprofileconfig, response);
		List value = service.getemailconfigValues();
		valuemap.put("emailprofileconfig", value);
		if (valuemap != null && valuemap.size() > 0) {
			lst.add(valuemap);
		}
		response.setResposnsecode(200);
		response.setData(lst);
		return response;

	}

	/* Update records to Email profile config */

	@RequestMapping(value = "/update_emailconfig_values", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseData putEmailConfigValues(@RequestBody final EmailprofileConfig emailprofileconfig,
			ResponseData<List<EmailprofileConfig>> response) {
		List lst = new ArrayList();
		Map valuemap = new HashMap<>();
		service.putEmailprofileConfig(emailprofileconfig, response);
		List value = service.getemailconfigValues();
		valuemap.put("emailprofileconfig", value);
		lst.add(valuemap);
		response.setData(lst);
		response.setResposnsecode(200);
		return response;
	}

	@RequestMapping(value = "/delete_emailconfig_values", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void deleteEmailConfigValues(@RequestBody final EmailprofileConfig emailprofileconfig,
			ResponseData<List<EmailprofileConfig>> response) {
		service.deleteEmailprofileConfig(emailprofileconfig, response);
	}
}
