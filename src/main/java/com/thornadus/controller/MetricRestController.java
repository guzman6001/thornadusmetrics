package com.thornadus.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thornadus.model.Metric;
import com.thornadus.service.api.MetricServiceAPI;

@RestController
@RequestMapping(value = "/api/")
@CrossOrigin("*")
public class MetricRestController {

	@Autowired
	private MetricServiceAPI metricServiceAPI;

	@GetMapping(value = "/metrics")
	public List<Metric> getAll() {
		return metricServiceAPI.getAll();
	}
	
	@GetMapping(value = "/metrics/{id}")
	public Metric find(@PathVariable Long id) {
		return metricServiceAPI.get(id);
	}

	@PostMapping(value = "/metrics")
	public ResponseEntity<Metric> save(@RequestBody @Valid Metric metric) {
		Metric obj = metricServiceAPI.save(metric);
		return new ResponseEntity<Metric>(obj, HttpStatus.OK);
	}

	@DeleteMapping(value = "/metrics/{id}")
	public ResponseEntity<Metric> delete(@PathVariable Long id) {
		Metric metric = metricServiceAPI.get(id);
		if (metric != null) {
			metricServiceAPI.delete(id);
		} else {
			return new ResponseEntity<Metric>(HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<Metric>(metric, HttpStatus.OK);
	}

}
