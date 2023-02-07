package com.springrest.springrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.springrest.springrest.dao.LoadDao;
import com.springrest.springrest.entities.load;
import com.springrest.springrest.services.LoadService;

@RestController
public class MyController {

	private final LoadService loadService ;
	
	public MyController(LoadService loadService) {
		this.loadService=loadService;
	}
	
	
	
	// get list of loads
	@GetMapping("/load")
	public List<load> getLoads(){	
	   return loadService.getLoads();	
	}
	
	@GetMapping("/load/{loadId}")
	public Optional<load> getLoad(@PathVariable("loadId") Long loadId) {
		return loadService.getLoad(loadId);
	}
	
	
	@PostMapping("/load")
	public load addload(@RequestBody load ll) {
		
		return loadService.addload(ll);
	}
	
	
	//update course using PUT request
	@PutMapping("/load")
	public load updateLoad(@RequestBody load ll) {
		return loadService.updateLoad(ll);
	}
	
	//delete the course
	@DeleteMapping("/load/{loadId}")
	public void deleteLoad(@PathVariable("loadId") Long loadId) {
		loadService.deleteLoad(loadId);
	}
	
	
	
	
}
