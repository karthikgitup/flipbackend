package com.web.flip.servicepack;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.web.flip.dto.ProductUpdateDto;
import com.web.flip.dto.ProductsSaveDto;
import com.web.flip.entity.ProductsEntity;

public interface ProductsService {

	public ProductsEntity createProduct(ProductsSaveDto productsSaveDto);

	public List<ProductsEntity> getAllProducts();

	public ResponseEntity<ProductsEntity> getProductById(Long id);

	public ResponseEntity<ProductsEntity> updateProduct(Long id, ProductUpdateDto productUpdateDto);

	public ResponseEntity<Void> deleteById(Long id);

	public List<ProductsEntity> createMoreProducts(List<ProductsSaveDto> listobj);


}
