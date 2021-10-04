package tech.getarrays.employeemanager.service;

import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.model.Product;
import tech.getarrays.employeemanager.repo.ProductRepo;

@Service
@Transactional
public class ProductService {
	 private final ProductRepo productRepo;

	/**
	 * @param productRepo
	 */
	 @Autowired
	public ProductService(ProductRepo productRepo) {
		this.productRepo = productRepo;
	}
	 
	 public List<Product> findAllProducts() {
			return productRepo.findAll();		
	    }
	 
}
