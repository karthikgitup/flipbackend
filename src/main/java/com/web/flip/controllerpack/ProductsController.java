package com.web.flip.controllerpack;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.flip.dto.ProductUpdateDto;
import com.web.flip.dto.ProductsSaveDto;
import com.web.flip.entity.ProductsEntity;
import com.web.flip.servicepack.ProductsService;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductsController {
	@Autowired
	private ProductsService productsService;
	
	@PostMapping
	public ProductsEntity createProduct(@RequestBody ProductsSaveDto productsSaveDto) {
		
		return productsService.createProduct(productsSaveDto);
		
	}
	
	@PostMapping("/multiple")
	public List<ProductsEntity> createMoreProducts(@RequestBody List<ProductsSaveDto> listobj){
		return productsService.createMoreProducts(listobj);
		
	}
	
	@GetMapping
	public List<ProductsEntity> getAllProducts(){
		
		return productsService.getAllProducts();
		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProductsEntity> getProductById(@PathVariable Long id){
		
		return productsService.getProductById(id);
		
}
	
	@PutMapping("/{id}")
	public ResponseEntity<ProductsEntity> updateProduct(@PathVariable Long id, @RequestBody ProductUpdateDto productUpdateDto){
		return productsService.updateProduct(id,productUpdateDto);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Long id){
		
		return productsService.deleteById(id);
		
	}
	

}
