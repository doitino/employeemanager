package tech.getarrays.employeemanager.resource;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.model.Product;
import tech.getarrays.employeemanager.service.EmployeeService;
import tech.getarrays.employeemanager.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductResource {
	 private final ProductService productService;

	/**
	 * @param productService
	 */
	public ProductResource(ProductService productService) {
		super();
		this.productService = productService;
	}
	 @GetMapping("/all")
	    public ResponseEntity<List<Product>> getAllProducts () {
	        List<Product> product = productService.findAllProducts();
	        return new ResponseEntity<>(product, HttpStatus.OK);
	    }

}
