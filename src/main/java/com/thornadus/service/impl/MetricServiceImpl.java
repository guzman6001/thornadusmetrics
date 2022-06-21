package com.thornadus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.thornadus.commons.GenericServiceImpl;
import com.thornadus.repo.MetricRepo;
import com.thornadus.model.Metric;
import com.thornadus.service.api.MetricServiceAPI;

@Service
public class MetricServiceImpl extends GenericServiceImpl<Metric, Long> implements MetricServiceAPI {

	@Autowired
	private MetricRepo personaRepo;
	
	@Override
	public CrudRepository<Metric, Long> getRepo() {
		return personaRepo;
	}

}
