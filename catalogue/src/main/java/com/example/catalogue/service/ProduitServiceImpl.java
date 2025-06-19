package com.example.catalogue.service;

import com.example.catalogue.exception.ProduitNotFoundException;
import com.example.catalogue.exception.ProduitInvalideException;
import com.example.catalogue.model.Produit;
import com.example.catalogue.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService {

    private final ProduitRepository produitRepository;

    @Autowired
    public ProduitServiceImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public List<Produit> findAll() {
        return produitRepository.findAll();
    }

    @Override
    public Produit findById(Long id) {
        return produitRepository.findById(id)
                .orElseThrow(() -> new ProduitNotFoundException("Produit introuvable avec l’id : " + id));
    }

    @Override
    public Produit save(Produit produit) {
        validerProduit(produit);
        return produitRepository.save(produit);
    }

    @Override
    public Produit updateProduit(Long id, Produit produit) {
        // Vérifie si le produit à modifier existe
        Produit existing = produitRepository.findById(id)
                .orElseThrow(() -> new ProduitNotFoundException("Produit à modifier introuvable avec l'id : " + id));

        validerProduit(produit); // ← Valide les nouvelles données

        // Met à jour les champs (sans changer l'ID)
        existing.setNom(produit.getNom());
        existing.setDescription(produit.getDescription());
        existing.setPrix(produit.getPrix());
        existing.setStock(produit.getStock());
        existing.setImageUrl(produit.getImageUrl());

        return produitRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        if (!produitRepository.existsById(id)) {
            throw new ProduitNotFoundException("Impossible de supprimer. Produit introuvable avec l’id : " + id);
        }
        produitRepository.deleteById(id);
    }

    /**
     * Méthode privée pour valider les règles métier sur un produit.
     */
    private void validerProduit(Produit produit) {
        if (produit.getNom() == null || produit.getNom().trim().isEmpty()) {
            throw new ProduitInvalideException("Le nom du produit est obligatoire.");
        }

        if (produit.getPrix() < 0) {
            throw new ProduitInvalideException("Le prix ne peut pas être négatif.");
        }

        if (produit.getStock() < 0) {
            throw new ProduitInvalideException("Le stock ne peut pas être négatif.");
        }
    }
}
