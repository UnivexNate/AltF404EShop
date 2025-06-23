package com.example.catalogue;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.catalogue.model.Produit;
import com.example.catalogue.repository.ProduitRepository;

@SpringBootApplication
public class CatalogueApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogueApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ProduitRepository produitRepository) {
		return args -> {
			produitRepository.save(new Produit(null, "T-shirt AltF404", "Édition limitée 2025", 25.0, 100, "/images/tshirt.jpg","vêtements"));
			produitRepository.save(new Produit(null, "Casquette brodée", "Casquette noir avec logo AltF404 brodé", 18.0, 50, "/images/casquettenoir.jpg", "accessoires"));
			produitRepository.save(new Produit(null, "Clavier Collab HyperY X AltF404", "Souris AltF404 en collaboration avec HyperY", 110.0, 10, "/images/clavier1.jpg","equipements"));
			produitRepository.save(new Produit(null, "Souris Gaming HyperLight Blanche AltF404", "Souris gaming blanche wireless", 70.0, 10, "/images/souris1.jpg","equipements"));
			produitRepository.save(new Produit(null, "Bracelet noir AltF404", "Bracelet noir avec logo AltF404 sur la partie metallique", 20.0, 10, "/images/bracelet1.png","accessoires"));
			produitRepository.save(new Produit(null, "Veste noir AltF404", "Veste noir avec logo AltF404 brodé", 120.0, 10, "/images/veste1.jpg","vêtements"));

		}; 
	}
}

