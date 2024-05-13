package com.web.flip.repopack;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.web.flip.entity.ProductsEntity;
@Repository
public interface ProductsRepository extends JpaRepository<ProductsEntity, Long> {

}
