package com.example.catalogue;

import com.example.catalogue.model.Produit;
import com.example.catalogue.repository.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CatalogueApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogueApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ProduitRepository produitRepository) {
		return args -> {
			produitRepository.save(new Produit(null, "T-shirt ShadowStrike", "Édition limitée 2025", 25.0, 100, "/images/tshirt.jpg","vêtements"));
			produitRepository.save(new Produit(null, "Casquette brodée", "Logo officiel", 18.0, 50, "/images/casquettenoir.jpg", "accessoires"));
		}; 
	}
}

