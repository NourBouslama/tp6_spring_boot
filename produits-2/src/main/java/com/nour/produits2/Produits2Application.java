package com.nour.produits2;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.nour.produits2.entities.Produit;
import com.nour.produits2.service.ProduitService;


@SpringBootApplication
public class Produits2Application implements  CommandLineRunner {
     
	@Autowired
	ProduitService produitService;
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	
	public static void main(String[] args) {
		SpringApplication.run(Produits2Application.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		produitService.saveProduit(new Produit("PC Dell", 2600.0, new Date()));
		produitService.saveProduit(new Produit("PC Asus", 2800.0, new Date()));
		produitService.saveProduit(new Produit("Imprimante Epson", 900.0, new Date()));

		
	}*/
	
	@Override
	public void run(String... args) throws Exception {
	repositoryRestConfiguration.exposeIdsFor(Produit.class);
	}


}
