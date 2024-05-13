package com.web.flip.servicepack;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.web.flip.dto.ProductUpdateDto;
import com.web.flip.dto.ProductsSaveDto;
import com.web.flip.entity.ProductsEntity;
import com.web.flip.repopack.ProductsRepository;

@Service
public class ProductsServiceImpl implements ProductsService {
	
	@Autowired
	private ProductsRepository productsRepository;

	@Override
	public ProductsEntity createProduct(ProductsSaveDto productsSaveDto) {
		
		ProductsEntity productsEntityobj=new ProductsEntity(productsSaveDto.getProduct(),productsSaveDto.getSellingprice(),productsSaveDto.getOrginalprice(),productsSaveDto.getDescripition(),productsSaveDto.getDisplay(),productsSaveDto.getCamera(),productsSaveDto.getBattery(),productsSaveDto.getProccessor(),productsSaveDto.getUrl(),productsSaveDto.getRating(),productsSaveDto.getReviews());
		
		return productsRepository.save(productsEntityobj);
	}

	@Override
	public List<ProductsEntity> getAllProducts() {
		
		return productsRepository.findAll();
	}

	@Override
	public ResponseEntity<ProductsEntity> getProductById(Long id) {
		Optional<ProductsEntity> optionalobj=productsRepository.findById(id);
		if(optionalobj.isPresent()) {
			return ResponseEntity.ok(optionalobj.get());
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}

	@Override
	public ResponseEntity<ProductsEntity> updateProduct(Long id, ProductUpdateDto productUpdateDto) {
		Optional<ProductsEntity> optionalobj=productsRepository.findById(id);
		if(optionalobj.isPresent()) {
			ProductsEntity product=optionalobj.get();
//			product.setName(productUpdateDto.getName());
//			product.setImgurl(productUpdateDto.getImgurl());
//			product.setDescription(productUpdateDto.getDescription());
//			product.setOriginalprice(productUpdateDto.getOriginalprice());
//			product.setSellingprice(productUpdateDto.getSellingprice());
//			product.setCompany(productUpdateDto.getCompany());
			product.setProduct(productUpdateDto.getProduct());
			product.setSellingprice(productUpdateDto.getSellingprice());
			product.setOrginalprice(productUpdateDto.getOrginalprice());
			product.setDescripition(productUpdateDto.getDescripition());
			product.setDisplay(productUpdateDto.getDisplay());
			product.setCamera(productUpdateDto.getCamera());
			product.setBattery(productUpdateDto.getBattery());
			product.setProccessor(productUpdateDto.getProccessor());
			product.setUrl(productUpdateDto.getUrl());
			product.setRating(productUpdateDto.getRating());
			product.setReviews(productUpdateDto.getReviews());
		return ResponseEntity.ok(	productsRepository.save(product));
					
		}else {
			return ResponseEntity.notFound().build();
		}
		
	}

	@Override
	public ResponseEntity<Void> deleteById(Long id) {
		
		productsRepository.deleteById(id);
		return ResponseEntity.noContent().build();
	}

	@Override
	public List<ProductsEntity> createMoreProducts(List<ProductsSaveDto> listobj) {
		
		  List<ProductsEntity> entities = new ArrayList<>();
		    for (ProductsSaveDto dto : listobj) {
		        ProductsEntity entity = new ProductsEntity(dto.getProduct(),dto.getSellingprice(),dto.getOrginalprice(),dto.getDescripition(),dto.getDisplay(),dto.getCamera(),dto.getBattery(),dto.getProccessor(),dto.getUrl(),dto.getRating(),dto.getReviews());
		        entities.add(entity);
		    }
		    return productsRepository.saveAll(entities);
	}
	
	

}
