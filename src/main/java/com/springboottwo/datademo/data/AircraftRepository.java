package com.springboottwo.datademo.data;

import com.springboottwo.datademo.model.Aircraft;
import org.springframework.data.repository.CrudRepository;

public interface AircraftRepository extends CrudRepository<Aircraft, Long> {
}
