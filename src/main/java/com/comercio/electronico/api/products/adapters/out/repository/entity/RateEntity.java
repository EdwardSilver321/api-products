package com.comercio.electronico.api.products.adapters.out.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "RATE_ENTITY")
public class RateEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int    id;
	private short  priceList;
	private String name;
	
}
