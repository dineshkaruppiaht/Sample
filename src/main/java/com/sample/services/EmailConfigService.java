package com.sample.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import com.sample.util.ResponseData;
import com.sample.dao.EmailConfigRepository;
import com.sample.entities.EmailprofileConfig;

@Service
public class EmailConfigService {

	@Autowired
	EmailConfigRepository emailconfigrepository;

	public List<EmailprofileConfig> getemailconfigValues() {
		return emailconfigrepository.findAllValues();
	}

	@Transactional(rollbackFor = Exception.class)
	public ResponseData<List<EmailprofileConfig>> setEmailprofileConfig(
			@RequestBody final EmailprofileConfig emailprofileconfig, ResponseData<List<EmailprofileConfig>> response) {

		if (emailprofileconfig != null) {
			emailconfigrepository.save(emailprofileconfig);
		}
		response.setResposnsecode(200);
		return response;

	}

	@Transactional(rollbackFor = Exception.class)
	public ResponseData<List<EmailprofileConfig>> putEmailprofileConfig(
			@RequestBody final EmailprofileConfig emailprofileconfig, ResponseData<List<EmailprofileConfig>> response) {
		if (emailprofileconfig != null) {
			emailconfigrepository.update(emailprofileconfig);
		}
		return response;

	}

	@Transactional(rollbackFor = Exception.class)
	public ResponseData<List<EmailprofileConfig>> deleteEmailprofileConfig(
			@RequestBody final EmailprofileConfig emailprofileconfig, ResponseData<List<EmailprofileConfig>> response) {
		if (emailprofileconfig != null) {
			emailconfigrepository.delete(emailprofileconfig);
		}
		return response;
	}

}
