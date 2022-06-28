package com.thornadus.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;



@Entity
public class Metric {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private Long id;
	
	@Column
	@NotBlank
	private String name;
	
	@Column
	@NotBlank
	private int metricValue;
	
	@Column
	@NotBlank
	private Timestamp metricTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMetricValue() {
		return metricValue;
	}

	public void setMetricValue(int value) {
		this.metricValue = value;
	}

	public Timestamp getMetricTime() {
		return metricTime;
	}

	public void setMetricTime(Timestamp metricTime) {
		this.metricTime = metricTime;
	}
	
	
}
