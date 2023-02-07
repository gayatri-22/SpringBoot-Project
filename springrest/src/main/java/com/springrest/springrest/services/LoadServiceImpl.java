package com.springrest.springrest.services;

//import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.LoadDao;
//import com.springrest.springrest.dao.LoadDao;
import com.springrest.springrest.entities.load;

@Service
public class LoadServiceImpl implements LoadService {
	
	private final LoadDao loadDao;

	public LoadServiceImpl(LoadDao loadDao) {
		super();
		this.loadDao = loadDao;
	}

	@Override
	public List<load> getLoads() {
		// TODO Auto-generated method stub
		return loadDao.findAll();
	}

	@Override
	public Optional<load> getLoad(long loadId) {
		// TODO Auto-generated method stub
		return loadDao.findById(loadId);
	}

	@Override
	public load addload(load ll) {
		// TODO Auto-generated method stub
		return loadDao.save(ll);
	}

	@Override
	public load updateLoad(load ll) {
		// TODO Auto-generated method stub
		return loadDao.save(ll);
	}

	@Override
	public void deleteLoad(long loadId) {
		// TODO Auto-generated method stub
		loadDao.deleteById(loadId);
	}
	
	
	
	

}
