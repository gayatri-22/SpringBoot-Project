package com.springrest.springrest.services;

import java.util.List;
import java.util.Optional;

import com.springrest.springrest.entities.load;

public interface LoadService {

	public List<load> getLoads();
	
	public Optional<load> getLoad(long loadId);
	
	public load addload(load ll);
	
	public load updateLoad(load ll);
	
	public void deleteLoad(long loadId);
		
	
}
