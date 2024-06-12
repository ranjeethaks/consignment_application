package com.consignment.consignment.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsignmentController {
	
	@Autowired
	ConsignmentRepository repo;
	
	@GetMapping("/consignment")
	public List<Consignment> getAllConsignments() {
		return (List<Consignment>)repo.findAll();
	}
	
	@PostMapping("/consignment")
	public Consignment saveConsignment(@RequestBody Consignment consignment) {
		return repo.save(consignment);
	}
	
	@PutMapping("/consignment/{id}")
	public Consignment updateConsignment(@PathVariable Integer id,Consignment consignment) {
		Consignment existing = repo.findById(id).orElseThrow(() -> new RuntimeException("Consignment not found: " + id));

		consignment.setConsignmentStatus(consignment.getConsignmentStatus()!=null?consignment.getConsignmentStatus():existing.getConsignmentStatus());
		consignment.setConsignmentCategory(consignment.getConsignmentCategory()!=null?consignment.getConsignmentCategory():existing.getConsignmentCategory());
		consignment.setDeliveryPartner(consignment.getDeliveryPartner()!=null?consignment.getDeliveryPartner():existing.getDeliveryPartner());
        repo.save(consignment);
		return existing;

	}
		
	@GetMapping("/consignment/{id}")
	public Consignment getConsignmentById(@PathVariable Integer id) {
		return repo.findById(id).orElseThrow(() -> new RuntimeException("Consignment not found: " + id));	
		}

}
