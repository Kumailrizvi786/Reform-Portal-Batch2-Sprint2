package com.rpfb2.portal.RPFB2.portal.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rpfb2.portal.RPFB2.portal.model.Angelhelper;
import com.rpfb2.portal.RPFB2.portal.repository.AngelHelperRepository;
import com.rpfb2.portal.RPFB2.portal.service.AngelHelperService;

@Service
public class AngelHelperService {
	
	private static final Logger log = LoggerFactory.getLogger(AngelHelperService.class);
	
	@Autowired
	private AngelHelperRepository repository;

	
	public Optional<Angelhelper> getAngelById(Long id) {
	
		return repository.findById(id);
	}

	
	public Iterable<Angelhelper> getAllAngel() {
		return repository.findAll();
	}

	
	public  Angelhelper addAngel( Angelhelper angel) {
		return repository.save(angel);
		

	}
	
	public  String deleteAngelByid(Long id) {
		 repository.deleteById(id);
		 return "deleted";
	}
	

	public  Angelhelper updateAngel(Angelhelper newAngel ,Long id) {
		
		  log.info("Updating the record for id "+ id + " Customer " + newAngel.toString()) ;
		 
		  Angelhelper angel = repository.findById(id).get();
		  
		 // angle.setAddress(newAngle.getAddress());
		 // angle.setFirstName(newAngle.getFirstName());
		 // angle.setLastName(newAngle.getLastName());
		  
		  repository.save(angel);
		  
		  log.info("Customer Updated ") ;
		 return angel;
	}
	
	
	
	
	
}

