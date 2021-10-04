package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.Product;

public interface ProductRepo extends JpaRepository<Product,Long>{

}
