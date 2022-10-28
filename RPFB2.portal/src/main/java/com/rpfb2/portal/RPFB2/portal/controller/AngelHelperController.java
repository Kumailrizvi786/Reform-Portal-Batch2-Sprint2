package com.rpfb2.portal.RPFB2.portal.controller;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rpfb2.portal.RPFB2.portal.service.AngelHelperService;
import com.rpfb2.portal.RPFB2.portal.model.Angelhelper;

@RestController
public class AngelHelperController {
	
	@Autowired
	private AngelHelperService service;
	
	@GetMapping("/AngelHelper/get/{id}")
	public Optional<Angelhelper> getAngelById(@PathVariable("id") Long id) {
		return service.getAngelById(id);
	}

	/**
	 * Read operation
	 * 
	 * @return
	 */
	@GetMapping("/allAngelRecord")
	public Iterable<Angelhelper> getAllAngel() {
		return service.getAllAngel();
	}

	/**
	 * write operation insert create
	 * 
	 * @param customer
	 * @return
	 */
	@PostMapping("/AngelHelper/create")
	public @ResponseBody Angelhelper addAngel(@RequestBody Angelhelper angel) {
		return service.addAngel(angel);
		

	}

	/**
	 * to delete a single record
	 * 
	 * @param id
	 */

	@DeleteMapping("/AngelHelper/delete/{id}")
	public void deleteAngel(@PathVariable("id") Long id) {
		service.deleteAngelByid(id);

	}

	/**
	 * to update the customer
	 * 
	 * @param newCustomer
	 * @param id
	 */

	@PutMapping("/AngleHelper/update/{id}")
	public Angelhelper updateAngel(@RequestBody Angelhelper newAngel, @PathVariable("id") Long id) {
		log.info("Updating the customer record " + newAngel);
		try {
		return service.updateAngel(newAngel, id);
		
		 }catch (Exception ex) {
		   log.error("new Angle not saved " + newAngel );
		}
        return null;
	}

}
	
	

