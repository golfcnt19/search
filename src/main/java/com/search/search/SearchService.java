package com.search.search;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SearchService {

	@Autowired
	private SearchRepository repo;
	
	public List<Search> listAll() {
		return repo.findAll();
	}
	
	public void save(Search search) {
        repo.save(search);
    }
     
    public Search get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }

}
