package com.search.search;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;





@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
public class SearchController {

	@Autowired
	private SearchService service;
	
	@GetMapping("/search")
	public List<Search> list() {
		return service.listAll();
	}
	
	@GetMapping("/search/{id}")
	public ResponseEntity<Search> get(@PathVariable Integer id) {
	    try {
	    	Search search = service.get(id);
	        return new ResponseEntity<Search>(search, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Search>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	@PostMapping("/search")
	public void add(@RequestBody Search search) {
		service.save(search);
	}
	
	@PutMapping("/search/{id}")
	public ResponseEntity<?> update(@RequestBody Search search, @PathVariable Integer id) {
	    try {
	        @SuppressWarnings("unused")
	        Search existProduct = service.get(id);
	        service.save(search);
	        return new ResponseEntity<>(HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }      
	}
	@DeleteMapping("/search/{id}")
	public void delete(@PathVariable Integer id) {
	    service.delete(id);
	}

}
