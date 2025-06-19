package com.example.catalogue.service;

import com.example.catalogue.model.Produit;
import java.util.List;

public interface ProduitService {
    List<Produit> findAll();
    Produit findById(Long id);
    Produit save(Produit produit);
    Produit updateProduit(Long id, Produit produit);
    void delete(Long id);
}

