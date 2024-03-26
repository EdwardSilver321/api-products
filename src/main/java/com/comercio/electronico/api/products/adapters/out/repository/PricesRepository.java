package com.comercio.electronico.api.products.adapters.out.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.comercio.electronico.api.products.adapters.out.repository.entity.PricesEntity;

public interface PricesRepository extends JpaRepository<PricesEntity, Long>{
	
	@Query("SELECT p FROM PricesEntity p WHERE :date BETWEEN p.startDate AND p.endDate AND p.productId.id = :productId AND p.brandId.id = :brandId")
	Optional<List<PricesEntity>> read(Date date, int productId, int brandId);

}
