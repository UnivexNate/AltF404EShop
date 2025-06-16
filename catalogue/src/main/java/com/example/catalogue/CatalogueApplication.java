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

	// Méthode pour insérer des données au démarrage
	@Bean
	CommandLineRunner runner(ProduitRepository produitRepository) {
		return args -> {
			produitRepository.save(new Produit());
			produitRepository.save(new Produit());
		};
	}
}

