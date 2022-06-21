package com.thornadus.repo;

import org.springframework.data.repository.CrudRepository;

import com.thornadus.model.Metric;

public interface MetricRepo extends CrudRepository<Metric, Long> {

}
